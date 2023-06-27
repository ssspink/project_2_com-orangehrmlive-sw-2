package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest
{
    public static WebDriver driver;

    public void OpenBrowser(String baseUrl)
    {
        //Set Up the Browser
        driver =new ChromeDriver();
        //Getting set for browser
            driver.get(baseUrl);
        //Maximizing the page
        driver.manage().window().maximize();
        //Using implicitTime
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
            //closing the current browser
        public void closeBrowser(){
            driver.close();
        }


}
