package Day3;

import java.util.ArrayList;

public class Ifelse_harder {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("DR");
        countries.add("Croatia");
        countries.add("Japan");
        countries.add("Thailand");
        countries.add("Turkey");
        countries.add("USA");
        countries.add("Australia");

        //using for loop to iterate through countries list and print out only the country is USA or Australia
        for (int i = 0; i < countries.size(); i++) {
            //two equal will compare the values from right and left side
            //whereas one equal use to set a value for a variable\

            /*
            if(countries.get(i) == "USA"){
                System.out.println("Country is USA. And index i is " + i);
            } else if(countries.get(i) == "Australia"){
                System.out.println("Country is Australia. And index i is " + i);
            }
            */

            //using OR(||) operator you can write both/multiple conditions on one if statement
            if (countries.get(i) == "USA" || countries.get(i) == "Australia") {
                System.out.println("Country is " + countries.get(i) + "  And index i is " + i);
            }
        }//end of loop
    }
}
