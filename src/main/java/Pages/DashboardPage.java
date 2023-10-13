package Pages;

import Base.BaseClass;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseClass {

    //Webelements

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    WebElement Dashboardtitle;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]")
    WebElement SidePanel;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")
    WebElement user_account;


    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }


    public boolean isDahboardDisplayed(){
        boolean Dashboard_element = Dashboardtitle.isDisplayed();
      //  System.out.println("Dashboard element is "+ Dashboard_element);
        return Dashboard_element;
    }

    public boolean isSidePanelDisplayed(){

        boolean sidepanel_element = SidePanel.isDisplayed();
        System.out.println("Side panel contents displaying result is" + sidepanel_element);
        String account_owner = user_account.getText();
        System.out.println(account_owner);
        return sidepanel_element;

    }
}
