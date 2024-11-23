package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class YourCartSteps {

    WebDriver driver = Hooks.getDriverValue;

    @Then("User should able to see the added first product")
    public void user_should_able_to_see_the_added_first_product() {
    }
}
