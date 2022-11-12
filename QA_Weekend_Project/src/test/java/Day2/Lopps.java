package Day2;

import java.util.ArrayList;
public class Lopps {

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("DR");
        countries.add("Croatia");
        countries.add("Japan");
        countries.add("Thailand");
        countries.add("Turkey");

        for(int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }
    }
}
