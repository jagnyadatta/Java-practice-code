/*
Inheritance is when properties & methods of parent class are passed on to a child class
*/

public class inheritance_1 {
    public static void main(String[] args) {
        fish f = new fish();
        f.eat();         //parent class method
        f.breaths();     //parent class method
        f.fins();        //child class method
    }
}

//Parent class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breaths(){
        System.out.println("Breaths");
    }
}

//Child class
class fish extends Animal{
    int fish;
    void fins(){
        System.out.println("fins are flying");
    }
}
