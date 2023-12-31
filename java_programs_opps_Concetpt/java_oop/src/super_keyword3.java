
class w1{

   w1(int a){
       System.out.println("The Value of a is.."+a);
   }

}

class w2 extends w1{


    w2(){
        super(123);
        System.out.println("That Is Default Constructure....");
    }


}


public class super_keyword3 {

    public static void main(String[] args) {

        int a,b,c,d;
        a=b=c=d=20;

        System.out.println(a+" "+b+" "+c+" "+d);

        w2 obj1=new w2();

    }

}
