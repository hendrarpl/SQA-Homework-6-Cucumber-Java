package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class continueShopping {
    WebDriver driver;
    @Given("opening browser")
    public void opening_browser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("opening www.saucedemo.com")
    public void gopening_web() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
    }

    @And("get web www.saucedemo.com")
    public void get_web() {
        driver.findElement(By.className("login_logo")).isDisplayed();
    }

    @When("inputing my username {string}")
    public void inputing_my_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("inputing my password {string}")
    public void inputing_my_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("click login-btn")
    public void click_login_btn() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("logging in and see products")
    public void logging_in_page_showing_products() {
        driver.findElement(By.id("header_container")).isDisplayed();
    }

    @And("add to cart")
    public void add_to_cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("click cart")
    public void shipping_cart_plus_new_product() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @And("click continue shopping")
    public void remove_cart_to_the_that_product() {
        driver.findElement(By.id("continue-shopping")).click();
    }

    @Then("show the products page")
    public void show_products() {
        driver.findElement(By.id("header_container")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
