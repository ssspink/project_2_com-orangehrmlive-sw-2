package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
        //url
       String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        @Before
        public void setUp()
        {
            OpenBrowser(baseUrl);
        }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {   //Find Element using Xpath and insert the value into username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //Find Element using Xpath and insert the value into password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //clicking on submit button
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main" +
                " orangehrm-login-button']")).click();

        String expectedDashboardMessage= "Dashboard";
        String actualDashboardMessage =driver.findElement(By.linkText("Dashboard")).getText();
        Assert.assertEquals(expectedDashboardMessage,actualDashboardMessage);

        Thread.sleep(5000);
    }
            @After
            public void tearDown(){
                closeBrowser();
    }

}
