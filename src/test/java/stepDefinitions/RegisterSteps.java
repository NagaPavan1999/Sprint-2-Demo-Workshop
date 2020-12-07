package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworks.DemoWorkshopMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import pageObjects.RegisterPage;
//import frameworks.DemoWorkshopMethods;



public class RegisterSteps {
	WebDriver driver;
	RegisterPage objRegister;
	
	//User will navigate to registration page

	@Given("^User is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
		driver=DemoWorkshopMethods.openBrowser();
		driver.get("http://demowebshop.tricentis.com/register");
		objRegister= new RegisterPage(driver);
		objRegister = PageFactory.initElements(driver,RegisterPage.class );
	}

	
	//User should enters all valid data

	@When("^User enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		
		
		//register to application
		objRegister.setclickGenderMale();
		objRegister.setFirstName("naga");
		objRegister.setLastName("pavan");
		objRegister.setEmail("nagapavan12345@gmail.com");
		objRegister.setPassword("123456");
		objRegister.setConfirmPassword("123456");
		objRegister.setclickRegister();
	}

	
	//User should be  Register Successful message
	
	@Then("^message displayed Register Successful$")
	public void message_displayed_Register_Successful() throws Throwable {

		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		Assert.assertEquals(actual, "Your registration completed");
		System.out.println("Register should be successful");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}
	
	
	//User  should leave first Name blank
	
	@When("^user leaves first Name blank$")
	public void user_leaves_first_Name_blank() throws Throwable {

		objRegister.setclickGenderMale();
		objRegister.setFirstName("");
		objRegister.setLastName("pavan");
		objRegister.setEmail("nagapavan@gmail.com");
		objRegister.setPassword("123456");
		objRegister.setConfirmPassword("123456");

	}
	
	
	//User should click on the register button
	
	@When("^clicks the register button$")
	public void clicks_the_register_button() throws Throwable {
		objRegister.setclickRegister();
	}

	
	//User should be displayed firstname error message
	
	@Then("^display firstname error message$")
	public void display_firstname_error_message() throws Throwable {
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/span[2]/span")).getText();
		Assert.assertEquals(actual, "First name is required.");
		System.out.println(" First name is required.");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}
	
	
	//User should leave last Name blank and clicks the register button
	
	@When("^user leaves last Name blank and clicks the button$")
	public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
		objRegister.setclickGenderMale();
		objRegister.setFirstName("naga");
		objRegister.setLastName("");
		objRegister.setEmail("nagapavan@gmail.com");
		objRegister.setPassword("123456");
		objRegister.setConfirmPassword("123456");
		objRegister.setclickRegister();
	}
	

	//User should be displayed lastname error message
	
	@Then("^display lastname error message$")
	public void display_lastname_error_message() throws Throwable {
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/span[2]/span")).getText();
		Assert.assertEquals(actual, "Last name is required.");
		System.out.println(" Last name is required.");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}
	
	 
	//User should enters all data
	
	@When("^user enters all data$")
	public void user_enters_all_data() throws Throwable {

		objRegister.setclickGenderMale();
		objRegister.setFirstName("naga");
		objRegister.setLastName("pavan");
		objRegister.setPassword("123456");
		objRegister.setConfirmPassword("123456");

	}

	
	//User should enter incorrect email format and clicks the button
	
	@When("^user enters incorrect email format and clicks the button$")
	public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
		objRegister.setEmail("nagapavangmail.com");
		objRegister.setclickRegister();
		
	}

	
	//User should display email error message
	
	@Then("^display email error message$")
	public void display_email_error_message() throws Throwable {
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span")).getText();
		Assert.assertEquals(actual, "Wrong email");
		System.out.println("Wrong email");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}
	
	
	//User should leave password blank and clicks the button
	
	@When("^user leaves password blank and clicks the button$")
	public void user_leaves_password_blank_and_clicks_the_button() throws Throwable {
		objRegister.setclickGenderMale();
		objRegister.setFirstName("naga");
		objRegister.setLastName("pavan");
		objRegister.setEmail("nagapavan@gmail.com");
		objRegister.setPassword("");
		objRegister.setConfirmPassword("123456");
		objRegister.setclickRegister();
	}

	
	//User should display password error message
	
	@Then("^display password error message$")
	public void display_password_error_message() throws Throwable {
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/span[2]/span")).getText();
		Assert.assertEquals(actual, "Password is required.");
		System.out.println("Password is required");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}
	 
	
	//User should leave confirm password blank and clicks the button
	
	@When("^user leaves confirm password blank and clicks the button$")
	public void user_leaves_confirm_password_blank_and_clicks_the_button() throws Throwable {
		objRegister.setclickGenderMale();
		objRegister.setFirstName("naga");
		objRegister.setLastName("pavan");
		objRegister.setEmail("nagapavan@gmail.com");
		objRegister.setPassword("123456");
		objRegister.setConfirmPassword("");
		objRegister.setclickRegister();
	}

	
	//User should display confirm password error message
	
	@Then("^display confirm password error message$")
	public void display_confirm_password_error_message() throws Throwable {
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")).getText();
		Assert.assertEquals(actual, "Password is required.");
		System.out.println("Password is required");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}	

}
