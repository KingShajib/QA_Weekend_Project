package Action_Item;

import java.util.ArrayList;

public class Action_Item_1_Automation {
    public static void main(String[] args){
        //Declare arraylist string
        ArrayList<String> country = new ArrayList<>();
        country.add("Bangladesh");
        country.add("Italy");
        country.add("Sinapore");
        country.add("Malaysia");
        //Declare Arraylist integer
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(123);
        countryCode.add(1);
        countryCode.add(881);
        countryCode.add(312);

        for(int i = 0;i < 4; i++){
            System.out.println("My country is " + country.get(i) + " and my country code is " + countryCode.get(i));
        } //end for loop
        //Declare array lists
        String[] region;
        region = new String[]{"Brooklyn", "Bronx", "Manhattan","Queens"};
        Integer[] areaCode;
        areaCode = new Integer[]{718, 917, 212, 646};
        //Counter
        int i = 0;
        //while loop
        while(i < 4){
            System.out.println("My region is " + region[i] + " and my area code is " + areaCode[i]);
            // counter
            i = i+1;
        }//End While loop
    }//End of main
}//End of class
