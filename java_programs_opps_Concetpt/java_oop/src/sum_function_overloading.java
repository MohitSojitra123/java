import java.util.Scanner;
class add{

    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }


}

public class sum_function_overloading {

    public static void main(String[] args){
        add obj2=new add();  //class and function object....
        int a,b,c,d;
        System.out.println("Enter Value of a...");
        Scanner obj1=new Scanner(System.in);  //user input object....
         a=obj1.nextInt();

        System.out.println("Enter value of b...");
        b=obj1.nextInt();

        System.out.println("Enter value of c...");
        c=obj1.nextInt();

        System.out.println("Enter value of d...");
        d=obj1.nextInt();


        obj2.sum(a,b);
        obj2.sum(a,b,c);
        obj2.sum(a,b,c,d);

    }

}
