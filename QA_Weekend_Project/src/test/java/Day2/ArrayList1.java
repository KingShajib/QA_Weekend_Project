package Day2;

import java.util.ArrayList;

public class ArrayList1 {
    //Main method
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("DR");
        countries.add("Croatia");
        countries.add("Japan");
        countries.add("Thailand");
        countries.add("Turkey");

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(2211);
        streetNumber.add(2132);
        streetNumber.add(2133);

        System.out.println(" Country: " + countries.get(2) + " Street Number " + streetNumber.get(1));

    }

    }

