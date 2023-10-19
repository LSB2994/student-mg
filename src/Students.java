import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // local variables
        int studentid;
        String studentName, classroom;
        char studentGender;
        float average, totalScore;

        //input
        System.out.println("Enter student ID: ");
        studentid = input.nextInt();

        System.out.println("Enter student name: ");
        input.nextLine();
        studentName = input.nextLine();

        System.out.println("Enter student Gender: ");
        studentGender =  input.next().charAt(0);

        System.out.println("Enter student classroom");
        input.nextLine();
        classroom = input.nextLine();

        System.out.println("Enter student Score: ");
        totalScore = input.nextFloat();

        System.out.println("Enter student average: ");
        average = input.nextFloat();

        // output
        System.out.println("========== Student Information ==========");
        System.out.println("Student's ID: "+studentid);
        System.out.println("Student's name: "+studentName);
        System.out.println("Student's Gender: "+studentGender);
        System.out.println("Student's classroom: "+classroom);
        System.out.println("Studnet's totalscore: "+totalScore);
        System.out.println("Studnet's average: "+average);

    }
}