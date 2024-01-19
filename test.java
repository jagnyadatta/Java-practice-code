public class test{
    public static void main(String[] args){
        int i=0;
        for(int j=0;j<3;j++){
            i=i+j;
        }
        System.out.println(i +"..."+ j);//j is local variable in for loop that's why here show compile time error
    }
}