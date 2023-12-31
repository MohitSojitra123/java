import java.util.Scanner;

public class relational_operator {
    public static void main(String[] args) {

        System.out.println("Enter Frist Value...");
        Scanner obj1=new Scanner(System.in);
        int a=obj1.nextInt();

        System.out.println("Enter Second Value...");
        int b=obj1.nextInt();

        System.out.println("a > b "+(a>b));
        System.out.println("a < b "+(a<b));
        System.out.println("a >= b "+(a>=b));
        System.out.println("a <= b "+(a<=b));
        System.out.println("a == b "+(a==b));
    }


}
