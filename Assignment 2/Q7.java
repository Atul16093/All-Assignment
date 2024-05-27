import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classHeld, classattend;
        System.out.print("Total class Held -: ");
        classHeld = sc.nextInt();
        System.out.print("Total class attended -: ");
        classattend = sc.nextInt();
        System.out.print("Is that any medical cause Give answer in 'Y' or 'N' -: ");
        String medic = sc.next();
        double TotalAttend = (double) classattend / classHeld * 100;
        if (TotalAttend >= 75 || medic.equals("Y")) {
            System.out.println("You're eligable to sit in the exam your total attendence is -: "+TotalAttend);
        } else {
            System.out.println("You're not eligable -:" + TotalAttend);
        }
    }
}
