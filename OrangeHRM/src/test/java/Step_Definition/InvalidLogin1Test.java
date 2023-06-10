package Step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin1Test {
    public WebDriver driver;
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("^I enter invalid Username$")
    public void iEnterInvalidUsername() {
        driver.findElement(By.name("username")).sendKeys("Maggie");
    }

    @And("^I enter invalid Password$")
    public void iEnterInvalidPassword() {
        driver.findElement(By.name("password")).sendKeys("admin123");
    }

    @When("^I press the login button$")
    public void iPressTheLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(2000);
    }

    @Then("^my login should not successful$")
    public void myLoginShouldNotSuccessful() {
        String ExpectedloggedInErrorMessage = "Invalid credentials";
        String ActualloggedInErrorMessage = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
        Assert.assertEquals(ExpectedloggedInErrorMessage, ActualloggedInErrorMessage);
        System.out.print(ActualloggedInErrorMessage);
    }
}
