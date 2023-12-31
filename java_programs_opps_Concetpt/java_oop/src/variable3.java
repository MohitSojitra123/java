class vari{

    int c=10; //instance variable
    static int  b=10;  //static variable

    public void view(){
        int a=10;   //local  variable
        System.out.println(a+"  "+b+" "+c);
        ++a;   //local variable
        ++b;   //static variable
        ++c;   //instance variable
    }
}



public class variable3 {


    public static void main(String[] args) {

        vari obj1=new vari();
        obj1.view();
        obj1.view();


    }
}
