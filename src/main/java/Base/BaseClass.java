package Base;

import Utility.testUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    public BaseClass() {
        try{
        prop = new Properties();
        FileInputStream ip = new FileInputStream("src/main/java/Config/config.properties");
        prop.load(ip);
        }
        catch(IOException e){
            System.out.println("File not found exception");
        }
    }

    public void startBrowser(){
        System.out.println("getting browser name");
        String browser = prop.getProperty("browser");
        if(browser.equals("chrome")){
           // System.setProperties("src/main/java/Driver");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\FirstTest\\src\\main\\java\\Driver\\chromedriver.exe");
           // WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Launching chrome browser");
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(testUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
       //  driver.get(prop.getProperty("url"));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }



}
