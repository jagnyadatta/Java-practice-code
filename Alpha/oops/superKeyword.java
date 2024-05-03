public class superKeyword {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();     // here this keyword will called Animal constructor
        super.color = "Green";
        System.out.println("horse constructor is called");
    }
}