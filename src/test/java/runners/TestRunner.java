package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="Features", glue={"stepDefinitions"},
//tags={"@Add_to_cart"})
tags={"@Successful_login,@Unsuccessful_login"})//,@Unsuccessful_login
//tags={"@Successful_Registration,@first_name_field_validation,@last_name_field_validation,@email_field_validation,@password_field_validation,@confirm_password_field_validation"})
public class TestRunner {

}