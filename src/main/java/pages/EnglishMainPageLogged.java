package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnglishMainPageLogged extends BasePageObject {
    private By usernameLogedInButton = By.xpath("//li[@id=\"pt-userpage\"]/a");
    private By searchBar = By.xpath("//input[@id=\"searchInput\"]");
    private By searchButton = By.xpath("//input[@id=\"searchButton\"]");

    public EnglishMainPageLogged(WebDriver driver){
        super(driver);
    }

     public boolean isUsernameDisplayed(){
        return isElementVisible(usernameLogedInButton);
     }

     public void searchForSomething(String text){
        sendKeysToElement(searchBar,text);
     }

     public SearchResultPage searchTheTerm(){
        clickElement(searchButton);
        return new SearchResultPage(driver);
     }


}
