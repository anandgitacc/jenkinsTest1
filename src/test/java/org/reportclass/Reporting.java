package org.reportclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void genReport(String jsonFile) {
		
		// 1. to give the path of file directory
		File file = new 
			File("C:\\Users\\Welcome\\eclipse-workspace\\CucumberProject10am\\src\\test\\resources\\Features\\Reports");
		
		// 2.  to create object for config class
		Configuration configuration = new Configuration(file, "Facebook login verification");
		
		configuration.addClassifications("OS", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("version", "99");
		configuration.addClassifications("Sprint", "13");
		configuration.addClassifications("Project", "Facebook");
		
		// 3. to give the list of files
		List<String> jsonFiles = new ArrayList<String>();
		
		jsonFiles.add(jsonFile);
		
		//4. to create object for ReportBuilder class
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		// 5. to generate jvm report
		builder.generateReports();
		
	}

}
