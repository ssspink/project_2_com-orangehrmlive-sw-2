package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    //url
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        OpenBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        //Using Xpath Clicking on forgot password links
        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']")).click();
        //Expected result from document
        String expectedResetPassword = "Reset Password";
        //Actual result of Reset Password
        String actualResetPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/h6")).getText();
        Assert.assertEquals(expectedResetPassword, actualResetPassword);
        Thread.sleep(8000);
    }

    @After
    public void closeBrowser() {
        driver.close();
    }

}
