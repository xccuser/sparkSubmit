package com.pktech.osmc.constant;

import java.math.BigDecimal;
import java.util.HashMap;


/*
 * @Xucc
 * 	参数syspro  A5-302-NF8460M3-162 cluster address2es-xzz defualt true
*/

public class Constants {
	
	
	public static final String frameworkName="mapreduce.framework.name";
	
	//系统提交模式
	public static final  String sysProperty="SPARK_YARN_MODE";
	
    //"A5-302-NF8460M3-162"  rs 提交
	public static final  String hostname="yarn.resourcemanager.hostname";

	//cluster模式
	public static final  String submitMode="spark.submit.deployMode";
	
	//应用名字
	public static final  String ApplicationName="spark.app.name";
	
	//defualt true
	public static final  String platform="mapreduce.app-submission.cross-platform";
	
	//defualt conFile
	public static final  String hdfsImpl="fs.hdfs.impl";
	public static final  String hdfsImplvalue= org.apache.hadoop.hdfs.DistributedFileSystem.class.getName();
	public static final  String fileImp="fs.file.impl";
	public static final  String fileImpValue=org.apache.hadoop.fs.LocalFileSystem.class.getName();

	
	
	
}
