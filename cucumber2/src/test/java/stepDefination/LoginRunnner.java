package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature1",
 glue= {"stepDefination"},
monochrome=true,
plugin={"pretty","junit:target/JunitReport/report.xml"
,"html:target/HtmlReports"
,"json:target/JSONReports/report/json"})

public class LoginRunnner {

}
