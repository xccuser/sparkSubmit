package com.pktech.osmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;



/**
 * spark 任务远程提交
 *
 * @author Xucc 
 * 
 * 
 */

@SpringBootApplication
@EnableApolloConfig
public class SubmitSpark {

	
	
	public static  void main(String[] args) {

		  SpringApplication.run(SubmitSpark.class, args);
		 
	}





}
