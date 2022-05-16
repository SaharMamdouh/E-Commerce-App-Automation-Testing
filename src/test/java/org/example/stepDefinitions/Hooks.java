package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

   public static WebDriver driver=null;
   @Before
    public void openBrowser() throws InterruptedException {
        //make the bridge between browser and test script
        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\browsers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        //create the object
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to the url of the website
        driver.navigate().to("https://demo.nopcommerce.com");
        Thread.sleep(3000);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
