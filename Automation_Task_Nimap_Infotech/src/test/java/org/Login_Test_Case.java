package org;

import Base.BaseTest;
import Pages.Login_Page;
import org.testng.annotations.Test;

public class Login_Test_Case  extends BaseTest {

    @Test
    public void verifyLogin(){
        Login_Page lp = new Login_Page(driver);
        lp.login("9519519519", "12345678");
    }

}
