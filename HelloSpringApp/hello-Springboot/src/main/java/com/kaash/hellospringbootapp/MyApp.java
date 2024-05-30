package com.kaash.hellospringbootapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
	
	@Value("${myapp.name}")
	private String appName;
	
	public String getAppName(){
		return appName;
	}
	
	public void setAppName(String appName) {
		this.appName = appName;
	}
}
