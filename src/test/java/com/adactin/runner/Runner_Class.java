package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.File_Reader;

import baseclass.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition",
monochrome=true,
dryRun=false,
strict=false,
tags=("@smokeTest,@sanityTest,@resgressionTest"),
plugin= {"html:Reports/Cucumber_html",
		"pretty",
		"json:Report/Cucumber_json.json"
		/*"com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"*/}
)
public class Runner_Class {
	public static WebDriver driver;
   @BeforeClass
   public static void setup() throws IOException {
	   String browser = File_Reader.getinstance().getCR().getBrowser();
	   driver=Base_Class.getBrowser(browser);
}
   @AfterClass
   public static void tearDown() {
    driver.close();
   }
}
