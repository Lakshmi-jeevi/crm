package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyinfoPage extends BaseClass {

    public MyinfoPage(){

        PageFactory.initElements(driver, this);
    }

    //Web Elements on My info page

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/svg")
    WebElement myinfo_option;

    //filling personal details form

    @FindBy(xpath = "input[@class='oxd-input oxd-input--active orangehrm-firstname']")
    WebElement firstname;
    @FindBy(xpath = "input[@class='oxd-input oxd-input--active orangehrm-middlename']")
    WebElement middlename;

    @FindBy(xpath = "input[@class='oxd-input oxd-input--active orangehrm-lastname']")
    WebElement lastname;

    @FindBy(xpath = "*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    WebElement emp_id;



}
