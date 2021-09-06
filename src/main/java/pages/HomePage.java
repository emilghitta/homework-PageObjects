package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageObject {
    private By englishLink = By.xpath("//a[@id=\"js-link-box-en\"]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public EnglishMainPage clickEnglishLink(){
        System.out.println("Clickin English link");
        clickElement(englishLink);
        return new EnglishMainPage(driver);
    }

}
