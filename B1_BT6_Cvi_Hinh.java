import  java.util.Scanner;
public class B1_BT6_Cvi_Hinh {
    public static final float PI= (float) 3.14;
    public static void  main(String[] arg){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius ");
            float r = sc.nextFloat();
            float ct = 2*PI*r;
            float st = PI*r*r;
            System.out.println("Circular circle is "+ct+" and Area circle is "+st);
            float Sc = 4*PI*r*r;
            float Vc = (4*PI*r*r*r)/3;
            System.out.println("Area sphere is "+Sc+" and volume sphere is "+Vc);
        

    }
}
