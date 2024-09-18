
import java.util.Scanner;

public class B1_BT2_DTB {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your point in math");
        int toan = sc.nextInt();
        System.out.println("Enter your  point in physic");
        int li = sc.nextInt();
        System.out.println("Enter your point in chemis");
        int hoa = sc.nextInt();
        float dtb = (toan+li+hoa)/3;
        System.out.printf("Your point avg %.2f", dtb );
    }
}
