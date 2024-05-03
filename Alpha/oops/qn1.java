public class qn1{
    public static void main(String args[]){
        Vehicle obj = new Car();
        obj.print();      //output - child class method

        Vehicle obj1 = new Vehicle();
        obj1.print();    //output - parent class method
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived class (car)");
    }
}