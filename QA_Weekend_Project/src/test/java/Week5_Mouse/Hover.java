package Week5_Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
    public static void main(String[] args) throws Exception{
        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //navigate to usps home page
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2000);

        //hover over to Send tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
        //declare mouse actions
        Actions actions = new Actions(driver);
        //always end with .perform()
        actions.moveToElement(sendTab).perform();

        Thread.sleep(1000);
        //click on calculate a price using mouse click
        WebElement calculatePrice = driver.findElement(By.xpath("//li[@class='tool-calc']"));
        actions.moveToElement(calculatePrice).click().perform();

    }
}
