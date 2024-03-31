package projeto.tricentis.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		tags = "@regressivos",
		glue = "projeto.tricentis.steps",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-reports.html"}	
		)
public class Executa {


}
