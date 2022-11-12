package Day_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Text {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://yahoo.com");

        Thread.sleep(2000);

        driver.manage().window().fullscreen();

        driver.findElement(By.xpath("//*[text()"));
    }
}
