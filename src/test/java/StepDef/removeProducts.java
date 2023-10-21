package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class removeProducts {
    WebDriver driver;
    @Given("open my browser")
    public void open_the_browser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("goto www.saucedemo.com")
    public void goto_www_saucedemo_com() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
    }

    @And("get on www.saucedemo.com")
    public void get_on_www_saucedemo_com() {
        driver.findElement(By.className("login_logo")).isDisplayed();
    }

    @When("input my username {string}")
    public void input_my_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("input my password {string}")
    public void input_my_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("clik the login button")
    public void click_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("page showing products")
    public void page_showing_products() {
        driver.findElement(By.id("header_container")).isDisplayed();
    }

    @And("click add to cart to product")
    public void click_add_to_cart_to_product() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("shipping cart +1 new product")
    public void shipping_cart_plus_new_product() {
        driver.findElement(By.className("shopping_cart_badge")).isDisplayed();
    }

    @And("click remove cart to the that product")
    public void remove_cart_to_the_that_product() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Then("shipping cart remove that product")
    public void shipping_cart_remove() {
        driver.findElement(By.className("shopping_cart_link"));
        driver.close();
        driver.quit();
    }
}
