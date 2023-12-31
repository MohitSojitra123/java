import java.util.Scanner;
class encaps{

    int age;
  private int ATMPIN;

  public void setATMPIN(){

      int password;
      int newATMPIN;
      System.out.println("Enter password...");
      Scanner obj2=new Scanner(System.in);
       password=obj2.nextInt();

      if(password==123456){
          System.out.println("Your password is Right....");
          System.out.println("Enter And Chage Password...");
          newATMPIN=obj2.nextInt();
          System.out.println("Your Password Is Sucessfull change...");
          this.ATMPIN=newATMPIN;
          System.out.println(ATMPIN);
      }else{
          System.out.println("Your Password Is Wrong");
      }
  }

}




public class encapsulation {

    public static void main(String[] args) {
        encaps obj1=new encaps();
       obj1.setATMPIN();



    }

}
