/*
   Method Overridden
*/

public class method_overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();     // parent method (overridden method)
        
        Deer d = new Deer();
        d.eat();     //child method (overriding method)
    }
}
//Parent class
class Animal{
    void eat(){
        System.out.println("eats everything");
    }
}
//Child class
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}