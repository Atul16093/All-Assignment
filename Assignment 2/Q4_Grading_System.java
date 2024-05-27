import java.util.Scanner;

public class Q4_Grading_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks = ");
        marks = sc.nextInt();
        if (marks > 80) {
            System.out.println("Congratulation ! you are scoring 80 above and you got grade -: A ");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("Awesome ! your grade is -: B ");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Good ! your grade is -: C ");
        } else if (marks >= 45 && marks < 50) {
            System.out.println(" your grade is -: D ");
        } else if (marks >= 25 && marks < 45) {
            System.out.println(" your grade is -: E ");
        } else{
            System.out.println("FAIL");
        }
    }
}

