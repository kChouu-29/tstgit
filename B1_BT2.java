
import java.util.Scanner;
public class B1_BT2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your sex ");
        String sex = sc.nextLine();
        System.out.println("Enter your phonenumber ");
        int phone = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your address ");
        String address = sc.nextLine();
        
        System.out.println("Enter your point");
        int point = sc.nextInt();
        System.out.println("Print your information................... ");
        System.out.println("Name :"+name +", Age: " +age+", Sex "+sex+", PhoneNumber "+phone+", Address "+address+", Point "+point);
        System.out.println("Vừa thêm thành công rồi nhé")
    }
}
