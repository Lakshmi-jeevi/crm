package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    public  LoginPage(){
        PageFactory.initElements(driver,this);
    }

    //Web elements in login page

    @FindBy(name="username")
    WebElement Username;  //username field

    @FindBy(name="password")
    WebElement password; // password field

    @FindBy(xpath="//button[@type=\"submit\"]")
    WebElement login_Button; // login button

    @FindBy(className = "orangehrm-login-branding")
    WebElement logo;

    @FindBy(className = "orangehrm-login-forgot")
    WebElement forget_password_link;

// methods to perform actions on Web elements


    public void login(String username, String pwd) throws InterruptedException {
        Username.sendKeys(username);
        password.sendKeys(pwd);
        Thread.sleep(2000);
        login_Button.click();

    }
    public  boolean is_logo_displayed(){
        Boolean logo_result = logo.isDisplayed();
        return  logo_result;
    }
    public boolean is_forget_pwd_link_available(){
      Boolean forget_pwd_link_status =   forget_password_link.isDisplayed();
        return forget_pwd_link_status;
    }


}
