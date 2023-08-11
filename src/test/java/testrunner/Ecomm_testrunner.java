package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="C:\\Users\\tithi\\Desktop\\Software Testing\\BDD_Ecommerce"
		+ "\\src\\test\\java\\feature",
		
glue= {"bdd_feature_def"}, 
plugin= {"pretty","html:target/htmlreport"}, 
dryRun=true, tags="@Regression or @Smoke or @Unit")

public class Ecomm_testrunner {
	

}