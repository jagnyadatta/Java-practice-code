public class RemoveDuplicate {
    public static void removeDp(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // main work
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']==true){
            //duplicate
            removeDp(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDp(str, idx, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        removeDp(str, 0, new StringBuilder(""), new boolean[26]);
    }
}