class encap{
private int roll_number;
private String name;
private String Address;
    void detaiil(){
        System.out.println("That Is Called Encapsulation...");
    }

  /*  encap(int r_number,String name1){
        roll_number=r_number;
        name=name1;
    }
    */

void setname(String name){
    this.name=name;

}

void setroll(int roll1){
        roll_number=roll1;

}


    int getroll(){
        return roll_number;
    }

    String getname(){
       return name;
    }

    String getAddress(String address1){  //combine to Getter and Setter Method....
        Address=address1;
        return  Address;
    }



}



public class eencapsultion {

    public static void main(String[] args) {

       encap obj1=new encap();
         obj1.setname("mohit");
         obj1.setroll(41);
        System.out.println(obj1.getname());
        System.out.println(obj1.getroll());

        System.out.println(obj1.getAddress("Rajkot Trikon Bag"));


    }

}
