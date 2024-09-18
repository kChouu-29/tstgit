import java.util.Scanner;

public class B1_BT5 {
    public static  final double RATE = 0.2;
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount sent ");
        int amount = sc.nextInt();
        System.out.println("Enter month ");
        int month = sc.nextInt();
        double interest = amount * month / 12 / 100 * RATE;
        System.out.println("Interest in "+month+" months is "+interest);

    }
}
