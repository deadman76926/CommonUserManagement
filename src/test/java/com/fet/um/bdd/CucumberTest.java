package com.fet.um.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty", "json:target/cucumber-report.json"})
@CucumberContextConfiguration
@SpringBootTest
public class CucumberTest {

    @AfterClass
    public static void onAfter() {
        CucumberReportRunner.generateReport();
    }

}