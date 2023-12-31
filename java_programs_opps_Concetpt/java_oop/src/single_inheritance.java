class A{
        public void show() {
            System.out.println("Tnat Is Called A class....");
        }
    }

    class B extends A{
        public void view() {
            System.out.println("That Is called B class");
        }
            }
    public class single_inheritance {



        public static void main(String[] args){
            B obj1=new B();
            obj1.show();
            obj1.view();


        }

    }
