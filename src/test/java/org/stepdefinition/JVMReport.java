package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
  
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");
		Configuration con =new Configuration(f,"Adactin Hotel Automation");
		con.addClassifications("Browser", "Firefox");
		con.addClassifications("Env", "UAT");
		con.addClassifications("OS", "WIN-7");

		List<String> jsonFiles= new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder=new ReportBuilder(jsonFiles, con);
		builder.generateReports();
	}

}
