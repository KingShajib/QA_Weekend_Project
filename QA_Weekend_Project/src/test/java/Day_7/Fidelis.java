package Day_7;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Fidelis {
    public static void main(String[] args) throws   InterruptedException{

        //Setup chromedriver
        WebDriverManager.chromedriver().setup();

        //Chrome Options
        ChromeOptions options = new ChromeOptions();

        //maximize and incognito
        options.addArguments("start-maximized", "incognito");

        //store chromedriver options
        WebDriver driver = new ChromeDriver(options);

        //go to fidelis
        driver.navigate().to("https://fideliscare.org");

        //Sleep time
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text() = 'Shop For a Plan']")).click();
        //wait a bit
        Thread.sleep(2000);
        //click on medicaid managed care
        driver.findElement(By.xpath("//*[text() = 'Medicaid Managed Care']")).click();
        //wait a bit
        Thread.sleep(2000);
        //click on find a doctor search icon (which will launch a new tab)
        driver.findElement(By.xpath("//*[@class= 'btn btn-outline-primary btn-external btn-show link-external']")).click();
        //wait a bit
        Thread.sleep(2000);
//store the tabs in arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        //enter a zip code on the search field
        driver.findElement(By.xpath("//*[@id = 'searchLocation']")).sendKeys("11230");
        //wait a bit
        Thread.sleep(2000);

    }
}
