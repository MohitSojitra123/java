class d1{

    public void show(){
        System.out.println("That Is d1 class Object....(call by super class...)");
    }

}
class d2 extends d1{

    public void show(){
        super.show();
        System.out.println("That Is d2 class Object...");
    }


}



public class super_keyword1 {
    public static void main(String[] args) {

        d2 obj1=new d2();
        obj1.show();

    }
}
