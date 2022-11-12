package Day2;

public class T4_whileloop_arrays {
    public static void main(String[] args){
    //Int array list declaration
        int[] streetNumber = new int[]{111,112,113,114,115,115,116,117};

        int i = 0; // In while loops the integer is defined outside of the parenthesis of the loop

        while( i < streetNumber.length){
            //linear array uses .length
            System.out.println(streetNumber[i]);
            //In while loops the incrementation is done at the end.
            i++; // i = i + 1 is also acceptable

        }//End of while loop

    } //end of main
}//End of class
