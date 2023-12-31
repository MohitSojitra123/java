   class Book_store{
    String pen_color;
    String type;

    public void write(){
        System.out.println("That Is Book Store Class....");
    }

    public void pen_color(){
        System.out.println("Pen Color is Define..."+this.pen_color);
    }

    public void type(){
        System.out.println("Pen type Is Define..."+this.type);
    }

}


public class class_object {
    public static void main(String args[]){

        Book_store obj1=new Book_store();
        System.out.println("That is oject one...");
        obj1.pen_color="red";
        obj1.type="Ballpen";

        obj1.write();
        obj1.pen_color();
        obj1.type();

        System.out.println();
        System.out.println("That is object two...");
        Book_store obj2=new Book_store();
        obj2.pen_color="black";
         obj2.type="gel";

        obj2.write();
        obj1.pen_color();
        obj2.type();


    }

}
