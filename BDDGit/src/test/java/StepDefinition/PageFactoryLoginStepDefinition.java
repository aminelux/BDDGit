package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.homePage;
import PageFactory.loginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFactoryLoginStepDefinition {

	static WebDriver driver;
	loginPageFactory login;
	homePage home;

	@Given("User is on Login page")
	public void user_is_on_login_page() {

	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().window().maximize();
	     driver.get("https://www.saucedemo.com/v1/");

	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {

		login = new loginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);





	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {

		login.clickOnLoginButton();

	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {

		//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='login_logo']")).size()>0,"User is navigated to Home page");
	    home = new homePage(driver);
	    home.isCartDisplayed();

	}

	@And("Close the browser")
	public void close_the_browser() {

		driver.quit();
	}

}
