class detail{

    String name;
    int age;

    public void view(){

        System.out.println("That Is personal Detail..");
    }

    public void view(int age){

        System.out.println("Your Age Is.."+age);
    }

    public void view(String name){

        System.out.println("Your Name Is..."+name);
    }



}


public class function_overloading {
    public static void main(String[] args) {
        detail obj1 = new detail();
        obj1.name = "mohit";
        obj1.age = 18;


        obj1.view();
        obj1.view(obj1.name);
        obj1.view(obj1.age);


        obj1.view();
        obj1.view("raj");
        obj1.view(14);

        String you="keval";
        obj1.view(you);


    }
}
