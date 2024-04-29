import java.util.*;
public class first{
    public static void main(String args[]){
        String str="jagnyadatta";
        String str2= new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        //name=sc.next();    //for single word
        name=sc.nextLine(); // for full line input
        System.out.println(name);
        System.out.println(str);
        System.out.println(str2);
        sc.close();
    }
} 