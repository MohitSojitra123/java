
class ok{
    int a,b,c;

    ok(ok mohit){
    this.a=mohit.a;   //mohit all value is assign in a variable
    this.b= mohit.b;
    this.c=a+b;

    }
    ok(){


    }


}


public class sum_copy_constructure {


    public static void main(String[] args){
    ok q1=new ok();
    q1.a=10;
    q1.b=20;

  ok mohit=new ok();
   mohit.a=20;
   mohit.b=300;

   ok q2=new ok(mohit);
        System.out.println(q2.c);


    }


}

