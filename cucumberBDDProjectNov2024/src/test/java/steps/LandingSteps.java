package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilityCommonPack.CommonElements;

public class LandingSteps {

    public LandingSteps()
    {}

    WebDriver driver = Hooks.getDriverValue;

    public LandingSteps(WebDriver driver) {
        this.driver = driver;
    }



}
