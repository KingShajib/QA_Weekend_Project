package Day3;

public class IfElse {
    public static void main(String[] args) {

        //declare variables
        int a, b , c;
        a=3;
        b=4;
        c=7;

        //If else statements
        if(a+b < c){
            System.out.println("a + b is less than C");
        } else if (a+b == c) {
            System.out.println("a+b = c");
        } else{
            System.out.println("a+b is > C");
        }
    } // End of main
}//End of class
