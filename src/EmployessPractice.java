import java.util.Scanner;

public class EmployessPractice {
    /*
    * name
    * gender
    * hour
    * wage ->
    *
    *
    * tax
    * salary >= 1000
    *       female -> tax = 30%
    *       male -> tax = 50%
    *
    * show infor
    * name
    * gender
    * tax
    * tax expense
    * remaining money*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Worker's name: ");
        String name = input.nextLine();
        System.out.println("Enter Worker's gender: ");
        String gender = input.nextLine();
        System.out.println("Enter Wage: ");
        float wage = input.nextFloat();
        System.out.println("Enter Hours: ");
        float hour = input.nextFloat();
        float salary = hour*wage;

        if(salary>=1000){
            if(gender.equalsIgnoreCase("female")){
                salary = salary - (salary * 0.3f);
            }else if(gender.equalsIgnoreCase( "male")){
                salary = salary - (salary * 0.5f);
            }else{
                System.out.println("Gender invalid");
            }
        }
        System.out.println("=================================");
        System.out.println("Name: "+name);
        System.out.println("Hour: "+hour + ((hour>1)? " hour": "hour"));
        System.out.println("Salary: "+salary + ((salary%2==0)? " even": " Odd"));
        if (hour*wage>=1000){
            if (gender.equalsIgnoreCase("female")){
                System.out.println("Tax = 30%"+"("+ hour*wage*0.3f+")");
            }else {
                System.out.println("Tax = 50%"+"("+ hour *wage*0.5f+")");
            }
        }
    }
}
