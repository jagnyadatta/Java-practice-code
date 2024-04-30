//For a given String convert each the first letter of each word to uppercase.
//"hi,i am jagnyadatta" - to - "Hi,I Am Jagnyadatta"
public class UpprCasetoStr {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); //append done first letter of string
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi, i am jagnyadatta";
        System.out.println(str);
        System.out.println(toUpperCase(str));
    }
}
