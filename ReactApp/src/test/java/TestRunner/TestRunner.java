	package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

//Run this class as cucumber class
@RunWith(Cucumber.class)

@CucumberOptions(
			features= {"SoftTech/Login.feature"},
			glue= {"StepDefination"},
			plugin= {"html:Reports/CucumberTest.html"},
			// it will display output console in proper readable format
			monochrome=true
			
		
		)
public class TestRunner {

}
