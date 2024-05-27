import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value -: ");
     int value = sc.nextInt();
     int absolute = Math.abs(value);
     System.out.println("The absolute value is -: "+value);
     sc.close();
    }
}
