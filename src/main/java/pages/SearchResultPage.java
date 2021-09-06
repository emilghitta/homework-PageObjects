package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePageObject{
    private By firstHeading = By.xpath("//h1[@id=\"firstHeading\"]");

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    public String currentUrl(){
        return getCurrentUrl();
    }

    public String headingText(){
        return getElementText(firstHeading);
    }


}
