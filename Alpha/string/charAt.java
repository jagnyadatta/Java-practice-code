public class charAt {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        String name = "jagnyadatta dalai";
        printletter(name);
    }
}
