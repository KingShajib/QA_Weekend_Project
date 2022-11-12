package Action_Item;

import Day2.Array;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class ActionItem4 {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        //Chrome Options
        ChromeOptions options = new ChromeOptions();

        //Chrome options args

        options.addArguments("start-maximized");


        //Declare webdriver variable
        WebDriver driver = new ChromeDriver(options);

        //ArrayList

        ArrayList<String> states = new ArrayList<>();

        states.add("New York");
        states.add("Las Vegas");
        states.add("Washington");

        ArrayList<Integer> adults = new ArrayList<>();
        adults.add(1);
        adults.add(2);
        adults.add(3);

        ArrayList<String> kids = new ArrayList<>();
        kids.add("1");
        kids.add("2");
        kids.add("3");

    //javascript executor
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        for(int i = 0; i < states.size(); i++){

                //navigate

                driver.navigate().to("https://www.hotels.com");

                Thread.sleep(2000);

                //click travelers
                try {
                    driver.findElement(By.xpath("//*[@class= 'uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")).click();
                }catch(Exception e) {
                    System.out.println("Cannot interact with element" + e);
                }
                //sleep
                Thread.sleep(1000);

                //Add Adults
                //Store add adult process
                WebElement addAdult = driver.findElement(By.xpath("//*[@aria-label='Increase the number of adults in room 1']"));

                //Bring adults down to 1
                driver.findElement(By.xpath("//*[@aria-label='Decrease the number of adults in room 1']")).click();

                //Loop for adults
                try {
                    for (int j = 2; j <= adults.get(i); j++) {
                        addAdult.click();
                    }
                }catch (Exception e) {
                    System.out.println("Error in code" + e);
                }


                ///Sleep
                Thread.sleep(1000);

                ///Add 1 kid
               try {
                   driver.findElement(By.xpath("//*[@aria-label='Increase the number of children in room 1']")).click();
               }catch (Exception e){
                   System.out.println("Could not interact with element" + e);
               }

                //

                Thread.sleep(1000);

                ///Pick age for kid

                //Click on childs age
                //Define variable for age drop down
                try {
                    WebElement ageDrop = driver.findElement(By.xpath("//*[@id= 'age-traveler_selector_children_age_selector-0-0']"));
                    ageDrop.click();
                    Select kidsAge = new Select(ageDrop);
                    //Get iteration from array
                    kidsAge.selectByVisibleText(kids.get(i));
                }catch (Exception e){
                    System.out.println("Could not Interact with element" + e);
                }

                //Sleep

                Thread.sleep(1000);




                //Click Done for travellers
                try{
                    driver.findElement(By.xpath("//* [@id= 'traveler_selector_done_button']")).click();
                }catch(Exception e){
                System.out.println("Could not interact with element" + e);
            }

                //send state
               try{
                   driver.findElement(By.xpath("//*[@aria-label= 'Going to']")).click();
               }catch (Exception e){
                   System.out.println("Could not interact with element" + e);
               }

                Thread.sleep(1000);

                driver.findElement(By.xpath("//*[@id= 'destination_form_field']")).sendKeys(states.get(i));

                Thread.sleep(1000);

                driver.findElements(By.xpath("//*[@class= 'uitk-typeahead-result-item has-subtext']")).get(0).click();

                //Sleep
                Thread.sleep(1000);
                // Click on submit

               try{
                   driver.findElement(By.xpath("//*[@id='submit_button']")).submit();
               }catch(Exception e){
                   System.out.println("Could not interact with element" + e);
               }

               //Get hotels
               //Conditionals to choose hotels ny iteration
                if(i == 0){

                }


            }//End of nested for loop
        }//end of for loop 1
    }//enmd of main


