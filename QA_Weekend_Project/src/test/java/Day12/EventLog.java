package Day12;

import Reusable.webdriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class EventLog {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void setupDriver(){
        driver = webdriver.setUpDriver();
        reports = new ExtentReports("src/main/java/");
    }
}
