public class strPalindrome {
    public static boolean isPalindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            int n=name.length();
            if(name.charAt(i)!=name.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String name = "racecar";
        boolean fn = isPalindrome(name);
        if(fn)
            System.out.println(name+" is a Palindrome");
        else
            System.out.println(name+" is not a Palindrome");    
    }
}
