package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeavePageTest {
    public static WebDriver driver;
    /*public LeavePageTest(){
        this.driver= driver;
    }*/
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        login(driver);

}
    public static  void login(WebDriver driver) throws InterruptedException {
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        Thread.sleep(2000);
        WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbtn.click();
        System.out.println("Loggedin successfully");
        Thread.sleep(2000);
        System.out.println("Clicking leave menu");
        WebElement leaveMenu = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a"));
        leaveMenu.click();
        System.out.println("On leave page");
        Thread.sleep(1000);
       WebElement startdate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div"));
      // startdate.clear();
       startdate.sendKeys("2023-02-10");

    }

}
