package pages;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnglishMainPage extends BasePageObject {
    private By loginButton = By.xpath("//li[@id=\"pt-login\"]/a");

    public EnglishMainPage(WebDriver driver){
        super(driver);
    }

    public LoginPage clickLogInLink(){
        clickElement(loginButton);
        return new LoginPage(driver);
    }

}
