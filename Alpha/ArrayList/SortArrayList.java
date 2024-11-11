import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;        //we can use this instead of importing each class individually

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(4);
        
        //before sorting
        System.out.println(list);
        Collections.sort(list);         //ascending order sorting
        //after sorting
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());         //Descending order sorting
        //after reverse sorting
        System.out.println(list);
    }
}
