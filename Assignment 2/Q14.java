import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks = sc.nextFloat();
        if (marks > 90) {
            System.out.println("Congratulation ! you are scoring 80 above and you got grade -: A ");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Awesome ! your grade is -: B ");
        } else if (marks >=60 && marks <= 80) {
            System.out.println("Good ! your grade is -: C ");
        } else if (marks >=35 && marks < 60) {
            System.out.println(" your grade is -: D ");
        } else{
            System.out.println("FAIL");
        }
    }
}
