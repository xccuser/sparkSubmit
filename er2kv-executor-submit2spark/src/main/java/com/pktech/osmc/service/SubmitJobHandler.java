package com.pktech.osmc.service;

import com.alibaba.fastjson.JSONObject;
import com.pktech.osmc.constant.Constants;
import com.pktech.osmc.model.Sparkparameter;
import com.pktech.osmc.util.Detect;
import com.pktech.osmc.util.SparkManger;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.hadoop.yarn.api.ApplicationConstants;
import org.apache.spark.deploy.yarn.Client;



/**
 * 命令行任务 
 *
 * @author xucc 2019-03-22 
 */
@JobHandler(value="submitSpark")
@Component
public class SubmitJobHandler extends IJobHandler {

	
		@Value("${spark.mainclass}")
	    private String mainClass;
		
	    @Value("${spark.jar}")
	    private String jarName;
	
	@Override
	public ReturnT<String> execute(String param) throws Exception {
		   XxlJobLogger.log(param);
		param=param.replaceAll("\n", "");
		param=param.replaceAll(" ", "");
		param=param.replaceAll("\t", "");
		param = param.replace(ApplicationConstants.PARAMETER_EXPANSION_RIGHT, "} }");
		/*param=param.replaceAll("{", "@");
		param=param.replaceAll("\"", "#");
		param=param.replaceAll("}", "%");*/
		
		JSONObject jsStr = JSONObject.parseObject(param);
		
		JSONObject domainId = JSONObject.parseObject(jsStr.get("data").toString());
		String codeProvide=(String) domainId.get("domainId");
		if(!Detect.notEmpty(codeProvide)) {
			return  IJobHandler.FAIL;
		}else {
			Sparkparameter.DOMAIN_SHORT_PINYIN.get(codeProvide);
			SparkManger.getSparkManger().getSparkConf().set(Constants.ApplicationName, "address2es-"+Sparkparameter.DOMAIN_SHORT_PINYIN.get(codeProvide));
		}
		System.out.println(Sparkparameter.DOMAIN_SHORT_PINYIN.get(codeProvide));
		
		String[] params = new String[] { 
                "--class",mainClass, 
                "--jar",jarName,
                "--arg",param};
		Client mclient=SparkManger.getSparkManger().getClient(params);
		mclient.run();
		return IJobHandler.SUCCESS;
	}
}
