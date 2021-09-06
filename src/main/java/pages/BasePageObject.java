package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePageObject {
    protected WebDriver driver;

    public BasePageObject(WebDriver driver){
        this.driver = driver;
    }

    protected void clickElement(By locator){
        waitForVisibility(locator,5);
        driver.findElement(locator).click();
    }

    protected void sendKeysToElement(By locator,String text){
        waitForVisibility(locator,5);
        driver.findElement(locator).sendKeys(text);
    }

    protected String getElementText(By locator){
         waitForVisibility(locator,5);
         return driver.findElement(locator).getText();
    }

    protected String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    protected boolean isElementVisible(By locator){
        waitForVisibility(locator,5);
        return driver.findElement(locator).isDisplayed();
    }

    protected void waitForVisibility(By locator, Integer time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
