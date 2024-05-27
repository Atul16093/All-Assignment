import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println(1900%100);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year -: ");
        int year = sc.nextInt();
        if(year%4==0 && year%100 !=0|| year%400==0){
                System.out.println("It's a leap year");
        }else{
            System.out.println("It's not a leap year");
        }

    }
}
