package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

WebDriver driver;

By txt_username= By.id("user-name");
By txt_password= By.id("password");
By btn_login = By.id("login-button");
By lbl_logo = By.xpath("//div[@class='login_logo']");

public loginPage(WebDriver driver) {

	this.driver = driver;
}

public void enterUsername(String username)

{
	driver.findElement(txt_username).sendKeys(username);

	}
public void enterPassword(String password)

{
	driver.findElement(txt_password).sendKeys(password);

	}

public void clicklogin()

{
	driver.findElement(btn_login).click();

	}

public void isAppLogoDisplayed()

{
	driver.findElement(lbl_logo).isDisplayed();
	}

public void userlogin(String username, String password)

{
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);
	driver.findElement(btn_login).click();
}

}
