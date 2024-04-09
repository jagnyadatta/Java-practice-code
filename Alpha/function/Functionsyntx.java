public class Functionsyntx {
    //new function
    public static void printHelloWorld(){
        //function Body
        System.out.println("Hello World");
    }

    //Retrun type int fuction
    public static int intReturn(){
        return 3;
    }
    public static void main(String args[]){
        //fuction call
        printHelloWorld();
        int retFun = intReturn();
        System.out.println(retFun);
    }
}
