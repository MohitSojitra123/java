

import java.util.Scanner;

class B1{
    public void showb1(){
        System.out.println("That is B1 class...");
    }
}


class B2 extends B1 {

    public void showb2() {
        System.out.println("That is B2 class...");

    }
}

    class B3 extends B1 {
        public void showb3() {
            System.out.println("That is B3 class...");
        }

    }


    public class hierarchical_inheritance {
        public static void main(String[] args) {

            B2 obj1 = new B2();
            obj1.showb1();

            B3 obj2 = new B3();
            obj2.showb1();


        }
    }



