import java.util.Scanner;

   //Simple and Single Constructure...

    class stu{
        stu(){
            System.out.println("Enter Your Name...");
           Scanner obj1=new Scanner(System.in);
            System.out.print("Your Name Is..."+obj1.nextLine());
        }
    }

public class simple_constructure {
    public static void main(String args[]){

        stu stu=new stu();


    }

}
