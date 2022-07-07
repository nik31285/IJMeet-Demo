package com.IJMeet_V1.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static Properties prop=new Properties();
	public static void openfile() throws IOException {
		String baseDir= System.getProperty("user.dir");
		FileInputStream fis= new FileInputStream(baseDir+"/src/main/resources/IJMeet_Envoirnment.properties");
		prop.load(fis);
	}
	public String getAppUrl() throws IOException {
		openfile();
		String value=prop.getProperty("app_url");
		System.out.println(value);
		return value;
	}
	public String get_logo() throws IOException {
		openfile();
		String logo1=prop.getProperty("logo_css");
		return logo1;
	}

}
