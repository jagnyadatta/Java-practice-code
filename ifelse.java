import java.util.*;     //java package
public class ifelse{
    public static void main(String[] args)
{
    try (Scanner sc = new Scanner(System.in)) {     //scanner
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
}