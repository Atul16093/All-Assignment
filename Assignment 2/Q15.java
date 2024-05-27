import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Bike Price -: ");
        int bikePrice = sc.nextInt();
        if(bikePrice>100000){
            float tax = bikePrice*15/100;
            System.out.println("Your payable road tax is -: "+tax + " and the total price you'll to pay is -: "+(tax+bikePrice));
        }else if(bikePrice>50000 && bikePrice<=100000){
            float tax = bikePrice*10/100;
            System.out.println("Your payable road tax is -: "+tax + " and the total price you'll to pay is -: "+(tax+bikePrice));
        }else{
            float tax = bikePrice*5/100;
            System.out.println("Your payable road tax is -: "+tax + " and the total price you'll to pay is -: "+(tax+bikePrice));
        }
    }
}
