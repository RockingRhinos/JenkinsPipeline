package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/features"},
				 glue="steps",
				 monochrome=true,
				 tags= {"@functional , @smoke"},
				plugin = {"html:reports"}
				// ,snippets = SnippetType.CAMELCASE
				 )
//OR
public class RunTest extends AbstractTestNGCucumberTests{
	

}
