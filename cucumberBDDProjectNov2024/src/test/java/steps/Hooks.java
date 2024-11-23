package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
    WebDriver driver;

    static WebDriver getDriverValue;

    //@Before
    public void before() {
        driver = new ChromeDriver();
        getDriverValue = driver;
    }

    //After
    public void after() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return getDriverValue;
    }
}
