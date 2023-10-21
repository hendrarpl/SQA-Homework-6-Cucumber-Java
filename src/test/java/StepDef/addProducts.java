package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addProducts {
    WebDriver driver;
    @Given("open the browser")
    public void open_the_browser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("open www.saucedemo.com")
    public void open_www_saucedemo_com() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
    }

    @And("landing on www.saucedemo.com")
    public void landing_on_www_saucedemo_com() {
        driver.findElement(By.className("login_logo")).isDisplayed();
    }

    @When("inputing username {string}")
    public void inputing_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("inputing password {string}")
    public void inputing_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("click login button")
    public void click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("showing products page with some products")
    public void showingProductsPageWithSomeProducts() {
        driver.findElement(By.id("header_container")).isDisplayed();
    }

    @And("click add to cart to first product")
    public void click_add_to_cart_to_first_product() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("shipping cart added new product")
    public void shipping_cart_added_new_product() {
        driver.findElement(By.className("shopping_cart_badge")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
