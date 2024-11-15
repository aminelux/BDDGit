package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	WebDriver driver;

	@FindBy(xpath="//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement lbl_cart;

	public void isCartDisplayed()
	{
		lbl_cart.isDisplayed();
	}

	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
