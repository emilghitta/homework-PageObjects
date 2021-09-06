package logInSuite;

import base.TestUtilities;
import org.junit.Assert;
import org.junit.Test;
import pages.*;

public class LogIn extends TestUtilities {
    String validUsername = "Gr1aut9";
    String validPassword = "automation1";
    String invalidUsername = "faifeosijfse";
    String invalidPassword = "dwafa";
    String searchTerm = "Automation";
    String searchURL = "https://en.wikipedia.org/wiki/Automation";


    @Test
    public void invalidLoginUsernameTest(){

        HomePage home = new HomePage(driver);

        EnglishMainPage englishMain = home.clickEnglishLink();


        LoginPage loginPage = englishMain.clickLogInLink();
        loginPage.addUsername(invalidUsername);
        loginPage.addPassword(validPassword);
        loginPage.clickLogInButton();

        Assert.assertEquals("Incorrect username or password entered.\n" +
                "Please try again.", loginPage.ErrorBoxText());

    }

    @Test
    public void invalidLoginPasswordTest(){
        HomePage home = new HomePage(driver);

        EnglishMainPage englishMain = home.clickEnglishLink();


        LoginPage loginPage = englishMain.clickLogInLink();
        loginPage.addUsername(validUsername);
        loginPage.addPassword(invalidPassword);
        loginPage.clickLogInButton();

        Assert.assertEquals("Incorrect username or password entered.\n" +
                "Please try again.", loginPage.ErrorBoxText());
    }

    @Test
    public void invalidLoginUsernameAndBasswordTest(){
        HomePage home = new HomePage(driver);

        EnglishMainPage englishMain = home.clickEnglishLink();


        LoginPage loginPage = englishMain.clickLogInLink();
        loginPage.addUsername(invalidUsername);
        loginPage.addPassword(invalidPassword);
        loginPage.clickLogInButton();

        Assert.assertEquals("Incorrect username or password entered. Please try again.", loginPage.ErrorBoxText());
    }

    @Test
    public void validLoginTest(){
        HomePage home = new HomePage(driver);

        EnglishMainPage englishMain = home.clickEnglishLink();


        LoginPage loginPage = englishMain.clickLogInLink();
        loginPage.addUsername(validUsername);
        loginPage.addPassword(validPassword);
        EnglishMainPageLogged loggedInMainPage= loginPage.clickLogInButton();

        Assert.assertTrue(loggedInMainPage.isUsernameDisplayed());
    }

    @Test
    public void searchTermAfterValidLoginTest(){
        HomePage home = new HomePage(driver);

        EnglishMainPage englishMain = home.clickEnglishLink();


        LoginPage loginPage = englishMain.clickLogInLink();
        loginPage.addUsername(validUsername);
        loginPage.addPassword(validPassword);
        EnglishMainPageLogged loggedInMainPage= loginPage.clickLogInButton();

        Assert.assertTrue(loggedInMainPage.isUsernameDisplayed());

        loggedInMainPage.searchForSomething(searchTerm);
        SearchResultPage searchResultPage= loggedInMainPage.searchTheTerm();

        Assert.assertEquals("Unexpected Url displayed",searchURL,searchResultPage.currentUrl());
        Assert.assertEquals("Unexpected heading displayed",searchTerm,searchResultPage.headingText());
    }
}
