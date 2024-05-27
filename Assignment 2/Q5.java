import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first person age - :");
        int p1 = sc.nextInt();
        System.out.print("Enter the second person age - :");
        int p2 = sc.nextInt();
        System.out.print("Enter the third person age - :");
        int p3 = sc.nextInt();
        int youngest = p1;
        if (p2 < youngest) {
            youngest = p2;
        } else if (p3 < youngest) {
            youngest = p3;
        }
        int oldest = p1;
        if (p2 > oldest) {
            oldest = p2;
        } else if (p3 > oldest) {
            oldest = p3;
        }
        System.out.println("The youngest person age is " + youngest + " and the oldest person is " + oldest);
    }
}
