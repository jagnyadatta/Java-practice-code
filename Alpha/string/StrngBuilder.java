public class StrngBuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        //time compelxity is O(26)
        System.out.println(sb);
    }
}
