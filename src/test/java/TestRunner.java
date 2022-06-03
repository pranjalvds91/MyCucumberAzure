import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src//test//resources//f1.feature"
		,glue={"stepdefinations"},
		strict = true
		)
public class TestRunner {

}
