
public class abstract_1 {
    public static void main(String args[]){
       // System.out.println("Hello Jagnyadatta");
       Horse h = new Horse();
       h.eat();
       h.walk();       //Horse abstract method executed
       System.out.println(h.color);  //default constructor

       chicken c = new chicken();
       c.eat();
       c.walk();       //Chicken abstarct method executed

       //Animal a = new Animal();
       //we cannot create abstract instance object
    }
}

abstract class Animal{       //abstract class
    String color;
    //Constructor
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();    //abstract method

}
class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal{
    void changeColor(){
        color="red";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}