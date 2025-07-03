package com.OrangeHRM.stepdefination;

import Pages.LoginpageRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class loginTest {

    private WebDriver driver;
    private LoginpageRepo lprepo;

    @Before
    public void setup()
    {

        driver = new ChromeDriver();
    }

    @After
    public void methodName() {
        if(driver != null)
        {
            driver.quit();
        }
    }

    @Given(Launch_the_Application)
    public void Launch_the_Application()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lprepo = new LoginpageRepo(driver);
    }

    @When(Given_the_username_and_password)
    public void Given_the_username_and_password()
    {
        lprepo.enterUsernameAndPassword(username,password);
    }

    @And(Click_on_login_button)
    public void Click_on_login_button()
    {
        lprepo.clickLoginBtn();
    }

    @Then(User_should_be_able_to_see_adminModule)
    public void User_should_be_able_to_see_adminModule()
    {
        system.out.println("Admin module is displayed: "+lprepo.adminModuleIsDisplayed());
    }

    @And(User_should_be_able_to_see_the_dashboard_or_homepage)
    public void User_should_be_able_to_see_the_dashboard_or_homepage()
    {
        String dashbordname = lprepo.getDashboardTxt();
        Assert.assertEquals(dashbordname,true);
    }

}
