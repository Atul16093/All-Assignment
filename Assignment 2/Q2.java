import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchasing Amount -: ");
        int purchased =sc.nextInt();
        if(purchased>=1000){
            int dis = purchased*10/100;
            System.out.print("The total discount of your purchased -: " +dis +" and the payable amount is -: "+(purchased-dis));
        }else{
            System.out.println("Your payable amount is -: "+purchased);
        }
    }
}
