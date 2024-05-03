public class abstract_2 {
    public static void main(String args[]){
        Mustang myh = new Mustang();  
        //constructor will be called like serial in down 
        //Animal -> Horse -> Mustang
    }
}
class Animal{
    Animal(){
        System.out.println("animal called");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse called");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang called");
    }
}
