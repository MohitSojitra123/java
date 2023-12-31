class as{

    class as1{
        void show(){
            System.out.println("that is nested class....");
        }

    }

}

class fin{

    public static void main(String[] args) {
        as obj1=new as();
        as.as1 obj2=obj1.new as1();
        obj2.show();
    }


}