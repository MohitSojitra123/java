class con12{

    con12(){
        System.out.println("That Is Called Default Constructure....");
    }

    con12(int age,String name){
        this();  //this keyword helps to call other constructure
        System.out.println("Your Name Is "+name+" "+" Your Age Is "+age);
    }
}



public class one_constructure_call_aotner_constructure {

    public static void main(String[] args) {
        con12 obj1=new con12(18,"Mohit");

    }
}
