import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 3425;
        int a , b ,c ;
        a = number%10;//5
        number = number/10;//342
        b = number%10;//342%10 = 2
        number = number/10;//34
        c = number%10;//34%10 = 4
        number = number/10;//34/10 = 3
        int reverse = (5*1000)+(2*100)+(4*10)+3;
        System.out.println("The reverse number is -: " +reverse);
    }
}
