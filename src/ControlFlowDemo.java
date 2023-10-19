import java.util.Scanner;

public class ControlFlowDemo {

    public static void main(String[] args) {
//        String actressName= "lisa";
//        if(actressName.equals("lisa"))
//            System.out.println("Your get nthe right actress");

        Scanner input = new Scanner(System.in);
        String name;
        float score;
        String grade;
        System.out.println("==== input student =====");
        System.out.println("Enter student name: ");
        name = input.nextLine();
        System.out.println("Enter studnet score: ");
        score = input.nextFloat();

        if(score>=95){
            grade = "A";
        }else if(score>=85){
            grade = "B";
        }else if(score>=75){
            grade= "C";
        }else if(score>=65){
            grade= "D";
        }else if(score>=55){
            grade = "E";
        }else {
            grade = "F";
        }
        System.out.println("========== Student  Result ==========");
        System.out.println("Student Name: "+name);
        System.out.println("Score: "+score);
        System.out.println("Grade: "+grade);
    }
}
