

//parameterized Constructure...
class sum{

    sum(int a,int b){
        int c=a+b;
        System.out.println("Total Is..."+c);

    }

}



public class parameterized_Constructure {

    public static void main(String[] args){
        sum obj1=new sum(10,20);

        int x=20;
        int y=40;
        sum obj2= new sum(x,y);


    }


}
