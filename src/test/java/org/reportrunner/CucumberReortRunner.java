package org.reportrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reportclass.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\FacebookLoginOutline.feature",
					glue="org.reportstepdef", monochrome=true,
					plugin= {"pretty", "json:src\\test\\resources\\Features\\Reports\\report.json"})
public class CucumberReortRunner {

	@AfterClass
	public static void afterclassreport() {
		
		Reporting.genReport("C:\\Users\\Welcome\\eclipse-workspace"
				+ "\\CucumberProject10am\\src\\test\\resources\\Features\\Reports\\report.json");;
	}
}
