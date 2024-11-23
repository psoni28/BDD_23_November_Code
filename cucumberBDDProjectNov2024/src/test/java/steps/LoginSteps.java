package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilityCommonPack.CommonElements;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver = new ChromeDriver();

    @Given("User redirect to login page")
    public void user_redirect_to_login_page() {

        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @When("User enter {string} in uername textbox")
    public void user_enter_in_uername_textbox(String username) {

        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @When("User enter {string} in password textbox")
    public void user_enter_in_password_textbox(String password) {

        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("User click login button")
    public void user_click_login_button() {

        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should not be login to application")
    public void user_should_not_be_login_to_application() {
        boolean result = driver.findElement(By.xpath("//*[@class='error-button']")).isDisplayed();
        Assert.assertTrue("login error text is not displayed", result);
    }

    @Then("User should be login successfully")
    public void user_should_be_login_successfully() {
        boolean result = driver.findElement(By.xpath("//div[text()='Swag Labs']")).isDisplayed();
        Assert.assertTrue("swag labs text is not displayed", result);
    }

    @When("User perform add to card on {int} product")
    public void user_perform_add_to_card_on_first_product(int count) {

        String locator = String.format(
                "(//button[text()='Add to cart'])[%d]", count);
        //(//button[text()='Add to cart'])[1]
        driver.findElement(By.xpath(locator)).click();

        String productNameLocator = String.format("((//button[text()='Add to cart'])[%d]/preceding::*[@class='inventory_item_name '])[last()]", count);

        String actualPrductName = driver.findElement(By.xpath(productNameLocator)).getText().trim();

        CommonElements.expetcedData.put(count + "", actualPrductName);
        CommonElements.expetcedData.put("count", count + "");
    }

    @Then("User validate count of the shopping cart badge")
    public void user_validate_count_of_the_shopping_cart_badge() {

        String actualCount = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();

        Assert.assertTrue("actual and expected count is not matched", actualCount.trim().equalsIgnoreCase(CommonElements.expetcedData.get("count").trim()));
    }

    @When("User click on shopping cart bage")
    public void user_click_on_shopping_cart_bage() {

        driver.findElement(By.className("shopping_cart_link")).click();
    }
}
