package Action_Item7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Action_Item7Auto {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> stuff = new ArrayList<>();
        stuff.add("Tennis");
        stuff.add("Gaming");
        stuff.add("Montreal trips");
        //Web Driver chrome
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        int i = 0;


        while(i < stuff.size()) {
            //Go to bing
            driver.navigate().to("https://bing.com");

            //wait
            Thread.sleep(2000);

            //enter into search
            driver.findElement(By.xpath("//* [@name = 'q']")).sendKeys(stuff.get(i));

            //Submit
            driver.findElement(By.xpath("//* [@viewBox= '0 0 25 25']")).submit();

            //Wait
            Thread.sleep(3000);

            //Get Text and store in array
            String result = driver.findElement(By.xpath("//* [@class= 'sb_count']")).getText();

            String[] splitResult = result.split(" ");

            System.out.println("The search for " + stuff.get(i) + " is " + splitResult[0]);

            //Iterate
            i++;

        }// loop end
        driver.quit();
    }// Main

}//Class
