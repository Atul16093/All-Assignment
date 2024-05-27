import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your service year -: ");
        float service = sc.nextFloat();
        System.out.print("Enter your salary -: ");
        int salary = sc.nextInt();
        if(service>=5){
            float bonous = (salary*5.f)/100;
            System.out.println("Your bonous is -: "+bonous +" and the total salary is including bonous -:"+(salary+bonous));
        }else{
            System.out.println("Your salary is -:" +salary);
        }
    }
}
