import java.util.ArrayList;
public class MultiDimensionalArrayList {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainList.add(list2);
        //main list print
        System.out.println(mainList);

        //print every indivisual element 
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currArray = mainList.get(i);
            for(int j=0; j<currArray.size(); j++){
                System.out.print(currArray.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
