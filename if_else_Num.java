import java.util.*;
public class if_else_Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b ){
            System.out.println("Equal"); //Show Equal when two numbers are same 
            System.out.println("You Entered Same Number"); //Show Equal when two numbers are same 
        }
        else {
            if(a>b){
                System.out.println("a is greater");//Show greater when a is greater than b
            }
            else{
                System.out.println("a is smaller");//Show smaller when a is smaller than b
            }
        }
    }
}