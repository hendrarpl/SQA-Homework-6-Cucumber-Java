package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSauceDemo {
    WebDriver driver;
    @Given("I Open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website www saucedemo")
    public void open_website_saucedemo() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
    }

    @And("Located www.saucedemo.com")
    public void locatedOnWebsite() {
        driver.findElement(By.className("login_logo")).isDisplayed();
    }

    @When("I input username {string}")
    public void iInputUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @And("I click login btn")
    public void iClickLoginBtn() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Showing products page")
    public void showingProductsPage() {
        driver.findElement(By.id("header_container")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
