import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age -: ");
        int age = sc.nextInt();
        if(age==Integer.MAX_VALUE){
            System.out.println("Number is valid");
        }else {
            System.out.println("You're entering the wrong input");
        }
        System.out.print("Enter your gender -: ");
        String Gender = sc.next();
        System.out.print("Enter your marital status -: ");
        String marital = sc.next();
        System.out.println("Age -: "+ age);
        System.out.println("Gender -: "+Gender);
        System.out.println("Marital Status -: "+ marital);
        if (Gender.equals("female")) {
            System.out.print("Work only in urban area");
        }else if(Gender.equals("male") && age>=20 ||age<=40){
            System.out.println("Work in any where");
        }else{
            System.out.println("Work in anywhere");
        }
    }
}
