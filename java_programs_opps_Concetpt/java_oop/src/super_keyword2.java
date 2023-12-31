
class s1{

    s1(){
        System.out.println("That IS s1 class constructure....");
    }

}
class s2 extends s1{

    s2(){
        //super.s1();    //by default set in java Compile...optional to you are specify...
        System.out.println("That Is s2 class Constructure...");
    }


}


public class super_keyword2 {
    public static void main(String[] args) {
        s2 obj1 = new s2();

    }
}
