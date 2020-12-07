package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworks.DemoWorkshopMethods;

public class AddToCartPage {
	WebDriver driver;
	
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")
	@CacheLookup
	WebElement books;

	@FindBy(linkText="Science")
	@CacheLookup
	WebElement Science;

	@FindBy(id="add-to-cart-button-27")
	@CacheLookup
	WebElement addtocart;

	@FindBy(xpath="//*[@id='bar-notification']/p")
	@CacheLookup
	WebElement displaymsg;



	public AddToCartPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//setters
	public void setclickBooks(){
		DemoWorkshopMethods.clickButton(books);
	}
	
	public void setclickScience(){
		DemoWorkshopMethods.clickButton(Science);
	}
	
	public void setclickAddToCart(){
		DemoWorkshopMethods.clickButton(addtocart);
	}
	
	//getters
	public WebElement getclickBooks(){
		return books;
	}
	public WebElement getclickScience(){
		return Science;
	}
	public WebElement getclickAddToCart(){
		return addtocart;
	}

}
