package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;
    protected String browser = "chrome";
    protected String testPage = "https://www.wikipedia.org/";

    @Before
    public void setUp(){
        BrowserDriverFactory factory = new BrowserDriverFactory(browser);
        driver = factory.setUpBrowser();

        driver.manage().window().maximize();
        driver.get(testPage);

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
