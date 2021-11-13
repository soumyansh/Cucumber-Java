package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features= {"src/test/java/features/Registration.feature"},
		glue= {"steps","hooks"},
		publish = true,
		plugin = {"pretty", "html:target/cucumber"},
		monochrome=true
		//tags="@Smoke and @Sanity"
		)
public class Test {
	
}
