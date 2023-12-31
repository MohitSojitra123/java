class h1{

    int a=10;

}


class h2 extends h1{

    int a=20;
    public void show(){
        System.out.println("The Value Of a Is..."+a);
        System.out.println("THe value of a Is..."+super.a);
    }

}



public interface super_keyword {

    public static void main(String[] args) {
        h2 obj=new h2();
        obj.show();
    }

}
