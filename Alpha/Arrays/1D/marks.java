public class marks {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]= marks[i]+10;
        }
    }
    public static void main(String args[]){
        int marks[]={25,26,27,28};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
    
}