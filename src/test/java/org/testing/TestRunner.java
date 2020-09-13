package org.testing;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ragavboom\\eclipse-workspace\\CucumberTasks1\\src\\test\\resources\\Feature\\Feature.feature",glue="org.stepdefinition",
    dryRun=false, monochrome=true,plugin= { "pretty"})
    		//,"json:\\src\\test\\resources\\Reporting\\cucumber.json"})
public class TestRunner {
//    
//	@AfterClass
//	public static void afterClass() {
//		
//   JVMReport.generateJVMReport
//     (System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\cucumber.json");
//	}
//	
}
