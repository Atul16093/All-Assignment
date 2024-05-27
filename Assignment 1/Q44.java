import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        int first_term = -21;
        int common_difference = 3;
        int current_term = first_term;
        for(int i =1 ; i<term ; i++){
            current_term += common_difference;
        }
        System.out.print(current_term+" ,");
    }
}
