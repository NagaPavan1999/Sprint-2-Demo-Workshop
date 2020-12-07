package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworks.DemoWorkshopMethods;

public class LoginPage {

	WebDriver driver;

	@FindBy(name="Email")
	@CacheLookup
	WebElement lemail;

	@FindBy(name="Password")
	@CacheLookup
	WebElement lpassword;

	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	@CacheLookup
	WebElement login;

	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//setters
	public void setenterEmail(String Email){
		DemoWorkshopMethods.sendData(lemail,Email);
	}

	public void setenterPassword(String Password){
		DemoWorkshopMethods.sendData(lpassword,Password);
	}
	
	public void setclickLogin(){
		DemoWorkshopMethods.clickButton(login);
	}
	

	//getters
	public WebElement getEmail(){
		return lemail;
	}
	public WebElement getPassword(){
		return lpassword;
	}
	public WebElement getclicklogin(){
		return login;
	}

}
