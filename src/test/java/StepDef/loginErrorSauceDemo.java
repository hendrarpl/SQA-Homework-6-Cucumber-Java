package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginErrorSauceDemo {
    WebDriver driver;
    @Given("I Open the browser")
    public void iOpenTheBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website wwwsaucedemo")
    public void open_website_wwwsaucedemo() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
    }

    @And("Located on www.saucedemo.com")
    public void locatedWebsite() {
        driver.findElement(By.className("login_logo")).isDisplayed();
    }

    @When("I input username with {string}")
    public void iInputUsernameWith(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I input password with {string}")
    public void iInputPasswordWith(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @And("I click login button")
    public void iClickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Showing error messages")
    public void showingError() {
        driver.findElement(By.className("error-message-container")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
