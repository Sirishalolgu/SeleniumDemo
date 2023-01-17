package com.training.utilities;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static com.training.utilities.Constants.USER_DIR;
import static com.training.utilities.Constants.FILE_SEPARATOR;
import static com.training.utilities.Constants.APPLICATION_PROPERTIES;


public class CommonUtilities {
	
	
	public String getproperty(String url) throws IOException
	{
	//String spath="C:\\Users\\cnudr\\eclipse-workspace\\TestNGSalesforceFramework\\properties\\application.properties";
	//Fileinput
		
		//userdir
	//	C:\\Users\\cnudr\\eclipse-workspace\\TestNGSalesforceFramework
		
		
		String spath=USER_DIR+FILE_SEPARATOR+APPLICATION_PROPERTIES;
	//String spath=System.getProperty("user.dir");
	FileInputStream fileinput=new FileInputStream(spath);
	//creating a object of properties
	Properties prop=new Properties();
	//load file to properties
	prop.load(fileinput);
	String value=prop.getProperty(url);
	
	
	return value;
	}
	
	
	
}
