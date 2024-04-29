public class SubStirng {
    public static String substring(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        //Substring
        String str = "Jagnyadatta";
        System.out.println(substring(str, 3, 8));
    }
}
