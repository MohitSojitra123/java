public class Exception_handling {

    public static void main(String[] args) {

        int a=10,b=20,c=100,d;

try {
    d =b/(a - c);
    System.out.println("Result Is..." + d);
}
 catch(Exception e){   //Optional..   (ArithmeticException e)
     System.out.println("That Is Programer Error...");
        }

        System.out.println(a + b + c);
    }

}
