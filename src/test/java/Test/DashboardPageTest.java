package Test;

import Base.BaseClass;
import Pages.DashboardPage;

import Pages.LoginPage;
import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class DashboardPageTest extends BaseClass {

    DashboardPage dashboardPage;

    // constructor of this class
    public DashboardPageTest(){
        super();
    }

    /*public void setup() {
        startBrowser();
        dashboardPage = new DashboardPage();
    }
    @Test(priority = 1)
    public void Test_dashboardelement(){

        System.out.println("Dashboard element is " + dashboardPage.isDahboardDisplayed());
    }
    @Test(priority =2)
    public  void Test_Sidepanelelement(){
        System.out.println("Side Panel element is "+ dashboardPage.isSidePanelDisplayed());
    }*/

    public void OnDashboard_test(){
        dashboardPage = new DashboardPage();
        System.out.println("Dashboard element is " + dashboardPage.isDahboardDisplayed());
        System.out.println("Side Panel element is "+ dashboardPage.isSidePanelDisplayed());


    }


}
