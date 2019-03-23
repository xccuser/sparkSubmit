package com.pktech.osmc.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.spark.SparkConf;
import org.apache.spark.deploy.yarn.Client;
import org.apache.spark.deploy.yarn.ClientArguments;

import com.pktech.osmc.constant.Constants;
import com.pktech.osmc.model.Sparkparameter;


public class SparkManger {

	private static  SparkManger mSparkManger=new SparkManger();
	private Configuration conf;
	private SparkConf sparkConf;
	
	Sparkparameter mSparkparameter=new Sparkparameter();
	
	public static SparkManger getSparkManger() {
		return mSparkManger;
	}
	
	
	public Client getClient(String[] param) {
		ClientArguments cArgs = new ClientArguments(param);
		Client client = new Client(cArgs,getConfiguration(),getSparkConf());
		return client;
	}
	
	
	public Client getClient(String[] param,Configuration conf,SparkConf sparkConf) {
		ClientArguments cArgs = new ClientArguments(param);
		Client client = new Client(cArgs,getConfiguration(),getSparkConf());
		return client;
	}
	
	public Configuration getConfiguration() {
		if(conf==null) {
			conf=new Configuration();
			conf.set(Constants.hdfsImpl, Constants.hdfsImplvalue);
			conf.set(Constants.fileImp,Constants.fileImpValue);
			String os = System.getProperty("os.name");
			boolean cross_platform = false;
			if (os.contains("Windows")) {
				cross_platform = true;
			}
			conf.setBoolean(Constants.platform, cross_platform);
			conf.set(Constants.frameworkName, "yarn");  
			System.setProperty(Constants.sysProperty, "true");
		}
		return conf;
	}
	
	public SparkConf getSparkConf() {
		if(sparkConf==null) {
			sparkConf=new SparkConf();
			sparkConf.set(Constants.hostname, mSparkparameter.getRMnamevalue());
			sparkConf.set(Constants.submitMode,mSparkparameter.getSubmitModevalue());
			//sparkConf.set(Constants.ApplicationName,mSparkparameter.getApplicationName());
		}
		return sparkConf;
	}
	
	
	public void setConfiguration(Configuration conf) {
		this.conf=conf;
	}
	
	public void setSparkConf(SparkConf sparkConf) {
		this.sparkConf=sparkConf;
	}
	
	
}
