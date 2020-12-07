package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworks.DemoWorkshopMethods;
import pageObjects.LoginPage;

public class LoginSteps {
	WebDriver driver;
	LoginPage  objlogin;
	
	
	//User should be navigated to login page
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver=DemoWorkshopMethods.openBrowser();
		driver.get("http://demowebshop.tricentis.com/login");
		objlogin = new  LoginPage(driver);
		objlogin = PageFactory.initElements(driver, LoginPage.class );
	}
	
	
	//User should enter all the valid data
	
	@When("^User enters all the valid data$")
	public void user_enters_all_the_valid_data() throws Throwable {
		objlogin.setenterEmail("nagapavan123@gmail.com");    Thread.sleep(1000);
		objlogin.setenterPassword("123456");    Thread.sleep(1000);
	}
	
	
	//User should click on Log in
	
	@When("^click on Log in$")
	public void click_on_Log_in() throws Throwable {
		objlogin.setclickLogin();
	}
	
	
	//User should be successfully logged in
	
	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		
		String actual=driver.getTitle();
		Assert.assertEquals(actual, "Demo Web Shop");
		System.out.println("login is successful");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}
	
	
	//User should give multiple dataset in email and password fields
	
	@When("^I enter Email  as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Email_as_and_Password_as(String arg1, String arg2) throws Throwable {
		objlogin.setenterEmail(arg1);    
		Thread.sleep(1000);
		objlogin.setenterPassword(arg2);  
		Thread.sleep(1000);
	}
	
	
	//User should be successfully logged in
	
	@Then("^login should be Unsuccessful$")
	public void login_should_be_Unsuccessful() throws Throwable {
		String actual=driver.getTitle();
		Assert.assertNotEquals(actual, "Demo Web Shop");
		System.out.println("login is unsuccessfull"); 
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}



}