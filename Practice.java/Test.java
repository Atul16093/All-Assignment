import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        byte value = sc.nextByte();
        //if we give one in the place of charAt(0) we occur a exception string index out of bound
        if(ch=='a'|| ch=='i'||ch=='e'||ch=='o'||ch=='u'){
            System.out.println("character is vowel ");
        }else{
            System.out.println("character is not vowel");
        }
        switch (value) {
            case 1:
                System.out.println("Hello one");
                break;
            case 2+1:
                 System.out.println("Hello two");
                break;
            default:
                 System.out.println("Invalid input");
                break;
        }
    }
}
