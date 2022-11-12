package Wednesday;

import java.util.ArrayList;

public class Wednesday_Practice {
    public static void main(String[] args) {
        //Declare string
        String[] cars = new String[]{"Alfa, BMW, Mercedes, Fiat, Honda, Audi"};

        //Declare i

        int i = 0;
        //Loop while
        while( i < cars.length){
            System.out.println(cars[i]);
            i++;
        }

    //Declare array list
        ArrayList<Integer> phoneNumber = new ArrayList<>();
        phoneNumber.add(514);
        phoneNumber.add(347);
        phoneNumber.add(718);
        phoneNumber.add(212);

        //print it
        for(i = 0; i < phoneNumber.size(); i++){
            System.out.println(phoneNumber.get(i));
        }


    }
}
