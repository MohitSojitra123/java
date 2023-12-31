//multilevel Inhertanace...

class A1{

    public void a1(){
        System.out.println("That Is called A1 class...");
    }

}
class A2 extends A1{
  public void a2(){
      System.out.println("That Is called A2 class...");
  }

}
class A3 extends A2{
public void a3(){
    System.out.println("That Is called A3 class...");
}

}

public class multilevel_inheritance {

    public static void main(String args[]){
        A3 obj1=new A3();
        obj1.a1();
        obj1.a2();
        obj1.a3();


    }
}
