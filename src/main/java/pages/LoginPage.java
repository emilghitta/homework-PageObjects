package pages;

import base.TestUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {
    private By usernameField = By.xpath("//input[@id=\"wpName1\"]");
    private By passwordField = By.xpath("//input[@id=\"wpPassword1\"]");
    private By logInButton = By.xpath("//button[@id=\"wpLoginAttempt\"]");
    private By errorBox = By.xpath("//div[@class=\"errorbox\"]");

    public LoginPage(WebDriver driver){
        super(driver);
    }


    public void addUsername(String username){
        sendKeysToElement(usernameField,username);
    }

    public void addPassword(String password){
        sendKeysToElement(passwordField,password);
    }

    public EnglishMainPageLogged clickLogInButton(){
        clickElement(logInButton);
        return new EnglishMainPageLogged(driver);
    }

    public String ErrorBoxText(){
        return getElementText(errorBox);
    }


}
