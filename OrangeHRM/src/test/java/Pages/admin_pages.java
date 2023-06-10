package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class admin_pages {

    //Declare your locators
    @FindBy(how = How.NAME, using = "username")
    public static WebElement usernameloginFied;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement passwordloginFied;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public static WebElement LoginButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    public static WebElement AdminmenuButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button")
    public static WebElement MenuToggleButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    public static WebElement SystemuserText;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    public static WebElement UsernameSearchFied;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    public static WebElement SearchButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")
    public static WebElement Usernamecol;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div")
    public static WebElement UserRoleCol;

    //Declare your methods
    public void enterloginusername(){
        usernameloginFied.sendKeys( "Admin");
    }
    public void enterloginPassword(){
        passwordloginFied.sendKeys( "admin123");
    }
    public void clickloginButton(){
        LoginButton.click();
    }
    public void clickAdminMenu(){
        AdminmenuButton.click();
    }
    public void closemenu(){
        MenuToggleButton.click();
    }
    public void AssertSystemUsersPages(){
        SystemuserText.isDisplayed();
    }
    public void SearchbyUsername(){
        UsernameSearchFied.sendKeys( "Admin");
    }
    public void clickSearchButton(){
        SearchButton.click();
    }
    public void AssertSearchresult(){
        String ExpectedReturnedUsername = "Admin";
        String ActualReturnedUsername = Usernamecol.getText();
        Assert.assertEquals(ExpectedReturnedUsername, ActualReturnedUsername);
        System.out.print(ActualReturnedUsername);

        String ExpectedReturnedUserRole = "Admin";
        String ActualReturnedUserRole = UserRoleCol.getText();
        Assert.assertEquals(ExpectedReturnedUserRole, ActualReturnedUserRole);
        System.out.print(ActualReturnedUserRole);

    }

}
