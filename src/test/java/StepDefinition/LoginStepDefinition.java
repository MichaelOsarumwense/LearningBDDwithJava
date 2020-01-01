package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

    WebDriver driver;
    @Given("^user is on home page$")
    public void given_user_is_on_home_page() {
        //System.setProperty("webdriver.chrome.driver", "/Users/sanmi/LearningBDDwithJava/src/test/resources/chromedriver.exe");
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.freecrm.com");
    }

        @When("^user navigates to login page$")
        public void when_user_navigates_to_login_page() {
        String title = driver.getTitle();
        System.out.println(title);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
        //driver.findElement(By.xpath("@id='account']/a")).click();
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("body>div.page>header>div>nav>div.rd-navbar-inner>div>div.rd-navbar-nav-wrap.toggle-original-elements>ul>a")).click();
    }

    @When("^the user clicks on login button$")
    public void theUserClicksOnLoginButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("email")).sendKeys("email");
    }

    @When("^message displays login successful$")
    public void messageDisplaysLoginSuccessful() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("password");
    }

   @Then("shut down the browser")
    public void shutDownTheBrowser() {
        driver.quit();
    }
}
