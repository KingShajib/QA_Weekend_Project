package Day_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellenium_Element {
    public static void main(String[] args) throws InterruptedException {

        //Webdriver declaration
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //Navigate to google
        driver.navigate().to("https://www.google.com");

        //Full Screen
        driver.manage().window().fullscreen();

        //Timer
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("Cars");

        //submit
        driver.findElement(By.xpath("//*[@name = 'btnK']")).submit();

        //Sleep before automating next page
        Thread.sleep(5000);

        //Locate text
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();


        //split
        String[] splitResult = result.split(" ");


        System.out.println("the search number is " + splitResult[1]);

        //quit the driver to end the session
        driver.quit();



    }
}
