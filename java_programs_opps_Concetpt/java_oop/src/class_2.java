import java.util.Scanner;
    class student{

        public void Enter(String name,String city,int roll_number){
            System.out.println("Your Name Is....."+name);
            System.out.println("Your City Name Is..."+city);
            System.out.println("Your Site Number Is..."+roll_number);
        }


    }

public class class_2 {
    public static void main(String args[]){
        student obj1=new student();
        //frist method

        //obj1.Enter("mohit","vadiya",41);


        // second method

        System.out.println("Enter Your name...");
        Scanner obj2= new Scanner(System.in);
        String nm=obj2.next();


        System.out.println("Enter City Name...");
        String ct=obj2.next();

        System.out.println("Enter Your Roll Number...");
        int roll=obj2.nextInt();

        obj1.Enter(nm,ct,roll);



    }

}
