package com.fet.um.bdd;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to generate html report from cucumber runner's json report output.
 */
public class CucumberReportRunner {

    private static final String PROJECT_NAME = "Hello Cucumber & Spring Boot";
    private static final String BUILD_NUMBER = "1.0.0";
    private static final String BRANCH_NAME = "master";


    public static void generateReport() {

        File reportOutputDirectory = new File("target/classes/static");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-report.json");

        // set values from respective build tool
        Configuration configuration = new Configuration(reportOutputDirectory, CucumberReportRunner.PROJECT_NAME);
        configuration.setBuildNumber(CucumberReportRunner.BUILD_NUMBER);
        configuration.addClassifications("Build Number", configuration.getBuildNumber());
        configuration.addClassifications("Branch Name", CucumberReportRunner.BRANCH_NAME);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
    
}
