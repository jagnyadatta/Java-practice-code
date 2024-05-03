/*
Method Overloading
*/

public class method_overloading {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(5,6));
        System.out.println(calc.sum((float)5.0,(float)6.0));
        System.out.println(calc.sum(5,6,7));
    }
}

class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}