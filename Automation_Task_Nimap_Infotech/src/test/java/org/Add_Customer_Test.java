package org;

import Base.BaseTest;
import Pages.Add_Customer;
import Pages.Login_Page;
import org.testng.annotations.Test;

public class Add_Customer_Test extends BaseTest {

    @Test
    public void verifyAddCustomer() throws Exception {

        Login_Page lp = new Login_Page(driver);
        Add_Customer cp = new Add_Customer(driver);
        lp.login("9519519519", "12345678");
        cp.openCustomerMenu();
        cp.clickAddCustomer();
        cp.setCustName("asdhg");

    }
}