package Week5_Mouse;

import Reusable.webdriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing_Examples {

    static WebDriver driver;
    @BeforeSuite

    public void SetChromeDriver(){
        driver = webdriver.setUpDriver();
    }//end of driver method

    @AfterSuite
    public void quitTheSession(){
        driver.quit();

    }//End of quit
    @Test(priority = 1)
    public static void SearchForCar(){
        driver.navigate().to("Https://www.google.com");
        ///call reuasable send keys
        webdriver.sendKeysAction(driver,"//*[@name= 'q']","BMW","Search Field");
        ///Create a reuasable submit action method
        webdriver.submitAction(driver,"//*[@name='btnK']","Google Search Button",2);
    }//end of test 1
    @Test(priority = 2)
    public void CaptureSearchNumber(){
        String result = webdriver.getTextAction(driver,"//*[@id='result-stats']","Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Result is " + arrayResult[1]);
    }//end of test 2

}//End


