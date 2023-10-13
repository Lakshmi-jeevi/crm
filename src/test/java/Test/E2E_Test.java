package Test;

import Base.BaseClass;
import Pages.DashboardPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class E2E_Test extends BaseClass {

    public E2E_Test(){
        super();
    }

    LoginPage loginPage;
    DashboardPageTest dashboardPagetest;
    LoginpageTest loginpageTest;
    @Test
    public void e2eTest() throws InterruptedException {
        loginpageTest=new LoginpageTest();
        dashboardPagetest = new DashboardPageTest();
        loginpageTest.init_login();
        dashboardPagetest.OnDashboard_test();

    }

}
