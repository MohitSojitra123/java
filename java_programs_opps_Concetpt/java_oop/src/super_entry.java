
class manager{
 int mobile_number=99096;
    int age0;
    String name0;

    public void emp(int age,String name){
       this.age0=age;
       this.name0=name;
    }

    public void show(){
        System.out.println("Your Age Is.. "+age0+" Your Name Is... "+name0);
    }

}
class developer extends manager{

      int mobile_number=94084;
    public void emp1(int age,String name){
        this.age0=age;
        this.name0=name;
    }

    public void  mobile(){
        System.out.println(super.mobile_number);
    }

    public void  mobile1(){
        System.out.println(mobile_number);
    }

}


public class super_entry {
    public static void main(String[] args) {

        developer obj1=new developer();
        obj1.emp1(19,"Raj");
        obj1.show();
        obj1.mobile();
        obj1.mobile1();


    }


}
