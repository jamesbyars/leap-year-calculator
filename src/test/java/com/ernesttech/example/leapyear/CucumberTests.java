package com.ernesttech.example.leapyear;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = {"classpath:features"},
        glue = {"com.ernesttech.example.leapyear"},
        plugin = {"pretty", "html:target/controller-reports/controller-html-report", "json:target/controller-reports/controller-json-report.json"}
)

public class CucumberTests {

}