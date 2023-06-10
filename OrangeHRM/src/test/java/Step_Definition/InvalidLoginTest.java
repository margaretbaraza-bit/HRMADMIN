package Step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTest {
    public WebDriver driver;
    @Given("^I get on the home page$")
    public void iGetOnTheHomePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("^I enter \"([^\"]*)\" in the Username field$")
    public void iEnterInTheUsernameField(String Username) throws Throwable {
        driver.findElement(By.name("username")).sendKeys(Username);

    }

    @And("^I enter \"([^\"]*)\" in the Password field$")
    public void iEnterInThePasswordField(String Password) throws Throwable {
        driver.findElement(By.name("Password")).sendKeys(Password);
    }

    @When("^I click the login$")
    public void iClickTheLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(2000);
    }

    //@Then("^I should get a correct error message$")
    //public void iShouldGetACorrectErrorMessage() {
    //}

    @Then("^I should get a correct \"([^\"]*)\"$")
    public void iShouldGetACorrect(String errorMessage) throws Throwable {
        String ExpectedloggedInErrorMessage = errorMessage;
        String ActualloggedInErrorMessage = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
        Assert.assertEquals(ExpectedloggedInErrorMessage, ActualloggedInErrorMessage);
        System.out.print(ActualloggedInErrorMessage);
    }
}
