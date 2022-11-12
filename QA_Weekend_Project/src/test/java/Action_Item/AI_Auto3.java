package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_Auto3 {

    public static void main(String[] args) throws InterruptedException{
    //Declare array list
        ArrayList<Integer> zipCodes = new ArrayList<>();
        //add integers to list
        zipCodes.add(11417);
        zipCodes.add(11208);
        zipCodes.add(10065);

        //Webdriver setup
        WebDriverManager.chromedriver().setup();

        //Chrome Options
        ChromeOptions options = new ChromeOptions();

        //Chrome options args

        options.addArguments("start-maximized", "incognito");


        //Declare webdriver variable
        WebDriver driver = new ChromeDriver(options);



        for(int i = 0; i <= zipCodes.size();i++){
            //Navigate to weight watAchers
            driver.navigate().to("https://weightwatchers.com");

            //sleep
            Thread.sleep(2000);

            //click on find a workshop

            driver.findElement(By.xpath("//*[@data-e2e-name= 'find_a workshop']")).submit();

            //Sleep
            Thread.sleep(2000);

            //Send zip code

            driver.findElement(By.xpath("//* [@id= 'location-search']")).sendKeys(zipCodes.get(i));



        }



    }
}
