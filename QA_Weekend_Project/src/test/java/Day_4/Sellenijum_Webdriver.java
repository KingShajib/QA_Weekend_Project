package Day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellenijum_Webdriver {
    public static void main(String[] args) throws InterruptedException {
        //Webdriver defined for chrome
        WebDriverManager.chromedriver().setup();
        //Define the chrome driver
        WebDriver driver = new ChromeDriver();

        //Navigate to google
        driver.navigate().to("https://www.google.com");

        //Timer
        Thread.sleep(3000);

        driver.quit();
    }
}
