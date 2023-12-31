import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class throws_exception {

    public static void main(String[] args) {

        System.out.println("Enter Any Number to Generate Factorial....");
        Scanner obj1=new Scanner(System.in);
        int user=obj1.nextInt();

        int fact=0;
        for(int i=1; i<=user; i++){
            fact+=i;   //fact=fact+i

        }
        System.out.println(fact);

    }
}
