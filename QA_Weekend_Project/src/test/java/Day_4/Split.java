package Day_4;

public class Split {
    public static void main(String[] args){
        //declare string
        String message = "My name is John";

        //Extract John from message("")
        //Call split message

        String[] splitMessage = message.split(" ");
        System.out.println(splitMessage[3]);

        //Split in java seperates based on what you choose to remove... Example: in splitMessage we split by " " which is a space.
        // So the message was split at every location a " " empty space is located. If you wanted to split by charachters then you remove the space: ""

        String[] splitMessage2 = message.split("");
        System.out.println(splitMessage2[2]);

    }//Main end
}//Class end
