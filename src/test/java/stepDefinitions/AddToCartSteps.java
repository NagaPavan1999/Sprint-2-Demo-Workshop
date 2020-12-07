package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworks.DemoWorkshopMethods;
import pageObjects.AddToCartPage;

public class AddToCartSteps {
	WebDriver driver;
	AddToCartPage objweb;
	
	//User should be on Home page
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		driver=DemoWorkshopMethods.openBrowser();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("nagapavan123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}


   //User should click on books link
	@When("^User clicks on books link$")
	public void user_clicks_on_books_link() throws Throwable {
		objweb = new AddToCartPage(driver);
	    objweb = PageFactory.initElements(driver,AddToCartPage.class );
		objweb.setclickBooks();
	}

	//User should selects a book to add to cart

	@When("^selects a book to add to cart$")
	public void selects_a_book_to_add_to_cart() throws Throwable {
		objweb.setclickScience();
	}

	//User should click on Add to cart

	@When("^click on Add to cart$")
	public void click_on_Add_to_cart() throws Throwable {
		objweb.setclickAddToCart();
	}

	//User should item is added to cart successfully

	@Then("^item is added to cart successfully$")
	public void item_is_added_to_cart_successfully() throws Throwable {
		String actual=driver.findElement(By.xpath("//*[@id='bar-notification']/p")).getText();
		Assert.assertEquals(actual, "The product has been added to your shopping cart");
		System.out.println("The product has been added to your");
		Thread.sleep(1000);
		driver=DemoWorkshopMethods.closeBrowser();
	}




}