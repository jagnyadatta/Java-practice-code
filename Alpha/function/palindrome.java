import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome or not :");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Number : "+num+ " is a Palindrome");
        }
        else{
            System.out.println("Number : "+num+" is Not a Palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int number){
        int pndm = number;
        int revNum = 0;
        while (pndm != 0){
            int rem = pndm % 10;
            revNum = revNum * 10 + rem;
            pndm = pndm / 10;
        }
        if(revNum == number){
            return true;
        }
        return false;
    }
}
