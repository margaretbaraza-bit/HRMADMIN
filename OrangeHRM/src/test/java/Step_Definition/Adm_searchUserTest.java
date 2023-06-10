package Step_Definition;

import Pages.admin_pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Adm_searchUserTest {
    public WebDriver driver;

    @Given("^I am logged in$")
    public void iAmLoggedIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.enterloginusername();
        page.enterloginPassword();
        page.clickloginButton();

        //driver.findElement(By.name("username")).sendKeys("Admin");
        //driver.findElement(By.name("password")).sendKeys("admin123");
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(3000);
    }

    @When("^I click the admin menu$")
    public void iClickTheAdminMenu() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.clickAdminMenu();
        Thread.sleep(2000);
        page.closemenu();
        //driver.findElement(By.xpath("//span[text() = ´Admin´]")).click();
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button")).click();
    }

    @Then("^I should see the users page$")
    public void iShouldSeeTheUsersPage() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.AssertSystemUsersPages();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")).isDisplayed();
    }

    @When("^I enter user data$")
    public void iEnterUserData() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.SearchbyUsername();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Alice.Duval");
        //Thread.sleep(2000);
        //new Select(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"))).selectByVisibleText("ESS");
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div")).sendKeys("Alice Duval");
        //Thread.sleep(2000);
        //new Select(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"))).selectByVisibleText("Disabled");
    }

    @And("^I click on the search button$")
    public void iClickOnTheSearchButton() throws InterruptedException {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.clickSearchButton();
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
        Thread.sleep(5000);
    }

    @Then("^Search result should return the correct user$")
    public void searchResultShouldReturnTheCorrectUser() {
        admin_pages page = PageFactory.initElements(driver, admin_pages.class);
        page.AssertSearchresult();
        //String ExpectedReturnedUsername = "Alice.Duval";
        //String ActualReturnedUsername = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).getText();
        //Assert.assertEquals(ExpectedReturnedUsername, ActualReturnedUsername);
        //System.out.print(ActualReturnedUsername);

        //String ExpectedReturnedUserRole = "ESS";
        //String ActualReturnedUserRole = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).getText();
        //Assert.assertEquals(ExpectedReturnedUserRole, ActualReturnedUserRole);
        //System.out.print(ActualReturnedUserRole);
    }
}
