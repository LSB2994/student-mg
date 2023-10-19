import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class TestingUnary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] scores = new int[5];

        for (int i = 0; i<scores.length; i++){
            System.out.println("Enter Score "+(i+1)+": ");
           scores[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(scores));
        /*int numberOfStudent;
        System.out.println("Enter the number of student: ");
        numberOfStudent = input.nextInt();
        System.out.println("There "+((numberOfStudent>1)?"are: ": "is: ")
                +numberOfStudent+" student"+((numberOfStudent>1)? "s":" "));*/
//        String str1 = "JAVA PROGRAMMING";
//
//        // convert to lower case letters
//        System.out.println(str1.toLowerCase());
//        System.out.println("sqtr of 4 is: "+Math.sqrt(4));

    }
}