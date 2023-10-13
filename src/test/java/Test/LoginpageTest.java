package Test;

import Base.BaseClass;
import Pages.LoginPage;
import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginpageTest extends BaseClass {
    LoginPage loginpage;

public LoginpageTest(){
    super();
}
/*@BeforeTest
public void setup(){
    startBrowser();
     loginpage = new LoginPage();

}
@Test(priority = 1)
public void logo_test(){
    System.out.println("LoginPage Logo validation is "+loginpage.is_logo_displayed());
}
    @Test(priority = 2)
    public void pwd_reset_test(){
    System.out.println("Reset link availability is "+ loginpage.is_forget_pwd_link_available());
}
    @Test(priority = 3)
    public void valid_loginTest() throws InterruptedException {
    loginpage.login(prop.getProperty("username"), prop.getProperty("password") );*/



    public void init_login() throws InterruptedException {
        startBrowser();
        loginpage = new LoginPage();
        System.out.println("LoginPage Logo validation is "+loginpage.is_logo_displayed());
        System.out.println("Reset link availability is "+ loginpage.is_forget_pwd_link_available());
        loginpage.login(prop.getProperty("username"), prop.getProperty("password") );
        System.out.println("Logged in successfully");
}
   /* @AfterTest public void teardown(){
        driver.quit();
    }*/


}
