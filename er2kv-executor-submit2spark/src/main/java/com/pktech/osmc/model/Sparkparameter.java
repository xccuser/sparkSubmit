package com.pktech.osmc.model;

import java.util.HashMap;
import java.util.Map;


/**
 * spark 任务远程提参数
 *
 * @author xucc 
 * 
 * 
 */

public class Sparkparameter {
	

	
	private static Map<String,String> params=new HashMap<String,String>();
	public static Map<String, String> DOMAIN_SHORT_PINYIN = new HashMap<String, String>();
	static {
		DOMAIN_SHORT_PINYIN.put("00", "test");//本机测试
		DOMAIN_SHORT_PINYIN.put("11", "bjj");//北京
		DOMAIN_SHORT_PINYIN.put("12", "tjj");//天津
		DOMAIN_SHORT_PINYIN.put("13", "hbj");//河北
		DOMAIN_SHORT_PINYIN.put("14", "sxj");//山西
		DOMAIN_SHORT_PINYIN.put("15", "nmgm");//内蒙古
		DOMAIN_SHORT_PINYIN.put("21", "lnl");//辽宁
		DOMAIN_SHORT_PINYIN.put("22", "jlj");//吉林
		DOMAIN_SHORT_PINYIN.put("23", "hljh");//黑龙江
		DOMAIN_SHORT_PINYIN.put("31", "shh");//上海
		DOMAIN_SHORT_PINYIN.put("32", "jss");//江苏
		DOMAIN_SHORT_PINYIN.put("33", "zjz");//浙江
		DOMAIN_SHORT_PINYIN.put("34", "ahw");//安徽
		DOMAIN_SHORT_PINYIN.put("35", "fjm");//福建
		DOMAIN_SHORT_PINYIN.put("36", "jxg");//江西
		DOMAIN_SHORT_PINYIN.put("37", "sdl");//山东
		DOMAIN_SHORT_PINYIN.put("41", "hny");//河南
		DOMAIN_SHORT_PINYIN.put("42", "hbe");//湖北
		DOMAIN_SHORT_PINYIN.put("43", "hnx");//湖南
		DOMAIN_SHORT_PINYIN.put("44", "gdy");//广东
		DOMAIN_SHORT_PINYIN.put("45", "gxg");//广西
		DOMAIN_SHORT_PINYIN.put("46", "hnq");//海南
		DOMAIN_SHORT_PINYIN.put("50", "cqy");//重庆
		DOMAIN_SHORT_PINYIN.put("51", "scs");//四川
		DOMAIN_SHORT_PINYIN.put("52", "gzq");//贵州
		DOMAIN_SHORT_PINYIN.put("53", "ynd");//云南
		DOMAIN_SHORT_PINYIN.put("54", "xzz");//西藏
		DOMAIN_SHORT_PINYIN.put("61", "sxs");//陕西
		DOMAIN_SHORT_PINYIN.put("62", "gsg");//甘肃
		DOMAIN_SHORT_PINYIN.put("63", "qhq");//青海
		DOMAIN_SHORT_PINYIN.put("64", "nxn");//宁夏
		DOMAIN_SHORT_PINYIN.put("65", "xjx");//新疆
	}

	
	private String  arg="\"{\"data\":{\"domainId\":\"31\",\"type\":\"0\",\"tables\":[\"CM_DEVICE\",\"CM_PORT\",\"RM_ADDRESS\"]} }\"";
	
	private String frameworkValue="yarn";
	private String sysPropertyValue="true";
	private String RMnamevalue="A5-302-NF8460M3-162";
	private String  submitModevalue="cluster";
	private String  ApplicationName="address2es-";
	private String 	CrossplatformValue="true";
	
	
	
/*	
	private String frameworkValue="yarn";
	private String sysPropertyValue="true";
	private String RMnamevalue="master";
	private String  submitModevalue="cluster";
	private String  ApplicationName="address2es-";
	private String 	CrossplatformValue="true";
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	private String[] paramArrays= new String[]{
			"--class","com.pktech.address2es.main.ConvertMain",
			"--jar","hdfs://A5-302-NF8460M3-157:8020/huku/address2es-convert-service-1.0.jar",
			"--arg",""
	};

	public String getSysPropertyValue() {
		return sysPropertyValue;
	}

	public void setSysPropertyValue(String sysPropertyValue) {
		this.sysPropertyValue = sysPropertyValue;
	}

	public String getRMnamevalue() {
		return RMnamevalue;
	}

	public void setRMnamevalue(String rMnamevalue) {
		RMnamevalue = rMnamevalue;
	}

	public String getSubmitModevalue() {
		return submitModevalue;
	}

	public void setSubmitModevalue(String submitModevalue) {
		this.submitModevalue = submitModevalue;
	}

	public String getApplicationName() {
		return ApplicationName;
	}

	public void setApplicationName(String applicationName) {
		ApplicationName = applicationName;
	}

	public String getCrossplatformValue() {
		return CrossplatformValue;
	}

	public void setCrossplatformValue(String crossplatformValue) {
		CrossplatformValue = crossplatformValue;
	}

	public String getFrameworkValue() {
		return frameworkValue;
	}

	public void setFrameworkValue(String frameworkValue) {
		this.frameworkValue = frameworkValue;
	}

	
	public static Map<String, String> getParams() {
		return params;
	}

	public static void setParams(Map<String, String> params) {
		Sparkparameter.params = params;
	}


	static {
		params.put("--class","com.pktech.address2es.main.ConvertMain");
		params.put("--jar","hdfs://A5-302-NF8460M3-157:8020/huku/address2es-convert-service-1.0.jar");
		params.put("--arg","");
	}
	
	
	
	
}
