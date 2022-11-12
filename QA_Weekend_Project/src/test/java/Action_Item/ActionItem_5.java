package Action_Item;

import Reusable.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ActionItem_5 {

        static WebDriver driver;
        @BeforeSuite
        public void SetChromeDriver () {
            driver = webdriver.setUpDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }//end of driver method


        @AfterSuite
        public void quitTheSession () {
            driver.quit();

        }//End of quit
        @Test(priority = 1)
        public static void dentistPlan () {
            driver.navigate().to("https://www.uhc.com");
            webdriver.clickAction(driver, "//*[@aria-label='Find a doctor']", "Find a doctor button");
            webdriver.scrollByView(driver,"//*[@aria-label='Find a dentist Opens a new window']","Find a Dentist link");
            webdriver.clickAction(driver,"//*[@href='https://connect.werally.com/plans/uhc/375']","Find a Dentist link");
            webdriver.switchTabByIndex(driver);
            webdriver.clickAction(driver,"//*[@data-test-id='EmployerandIndividualPlans']","Plan Choice");




        }//End of dentistPlan
        @Test(priority = 2)
        public static void localDentist () {
            webdriver.sendKeysAction(driver, "//*[@id='location']", "11208", "Zip Code Field");
            webdriver.clickAction(driver,"//*[@id='auto_0']","Click drop down");
            webdriver.clickAction(driver, "//*[text()='Continue']", "Continue button");
            webdriver.clickAction(driver, "//div[contains(text(),'National')]", "National Options");
            webdriver.clickAction(driver, "//*[text()='*National Options PPO 30']","Click Options");
            webdriver.clickAction(driver, "//*[@data-test-id='GeneralDentists']","Click General Dentist");


        }

}//End of class
