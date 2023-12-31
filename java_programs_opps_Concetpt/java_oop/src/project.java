import java.util.Scanner;

public class project {

    public static void main(String[] args) {

        int otp=(int)(Math.random()*10);
        System.out.println(otp);

        Scanner obj1=new Scanner(System.in);
        int user;
        do{
            System.out.println("Gueess The OTP To Generate Automatic...");
            user=obj1.nextInt();

            if(user==otp){
                System.out.println("Correct..."+otp);
            }
            else if(user<otp){
                System.out.println("otp is less than");
            }
            else if(user>otp){
                System.out.println("otp is Grate...");
            }
        }while(user>0);


        System.out.println(otp);




    }
}
