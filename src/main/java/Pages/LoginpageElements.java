package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageRepo {

    private WebDriver driver;
    public LoginpageRepo(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    private By logo = By.xpath("//*[@class='orangehrm-login-branding']");
    private By username = By.xpath("//*[@name='username']");
    private By password = By.xpath("//*[@name='password']");
    private By loginBtn = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    private By dashBoard = By.xpath("(//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    private By admin = By.xpath("//*[text()='Admin']");
    /*@FindBy(xpath="//*[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]") WebElement addUser;
    @FindBy(xpath="//*[text()=\"User Role\"]//parent::div//following-sibling::div") WebElement userRole;
    @FindBy(xpath="//*[@class=\"oxd-main-menu-item active\"]") WebElement recruitment;
    @FindBy(xpath="//*[@class=\"oxd-text oxd-text--h5 oxd-table-filter-title\"]") WebElement candidates;
    @FindBy(xpath="//*[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]") WebElement addCandidate;
    @FindBy(xpath="//*[@href=\"/web/index.php/pim/viewPimModule\"]") WebElement pimLink;
    @FindBy(xpath="//*[text()='Add Employee']") WebElement addEmployee;
    @FindBy(xpath="//*[text()='Employee Full Name']") WebElement elemployeeFullName;
    @FindBy(name="firstName") WebElement firstName;
    @FindBy(name="lastName") WebElement lastName;
    @FindBy(xpath="//*[@class=\"oxd-input-group__label-wrapper\"]//following-sibling::div//input[@class=\"oxd-input oxd-input--active\"]") WebElement employeeID;
    @FindBy(xpath="//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") WebElement saveBtn;
*/
    public void applicationLogo()
    {
        WebElement applogo = driver.findElement(logo);
        applogo.click();
    }

    public void enterUsernameAndPassword(String un, String pwd)
    {
        WebElement Username = driver.findElement(username);
        Username.sendKeys(un);
        WebElement Password = driver.findElement(password);
        Password.sendKeys(pwd);
    }

    public void clickLoginBtn()
    {
        WebElement loginButton = driver.findElement(loginBtn);
        loginButton.click();
    }

    public Boolean adminModuleIsDisplayed()
    {
        WebElement adminModule = driver.findElement(admin);
        return adminModule.isDisplayed();
    }

    public String  getDashboardTxt() {
        WebElement dashbord = driver.findElement(dashBoard);
        return dashbord.getText();
    }
}
