package stepDefinitionPack;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin= {"html:TestReport/CucumberTestReport"},
		features="src/main/resources/Feature" ,
		glue="stepDefinitionPack",
		////tags= {"@BmiFeature, @Fundtransfer, @DataTableFeature", //tag of feature files
				//"@Normal, @Vpva, @DataTable"}, // tag of scenarios
		
	tags= {//tag of feature files
		"@Normal, @Vpva, @DataTable"}, // tag of scenarios
		monochrome=true
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
