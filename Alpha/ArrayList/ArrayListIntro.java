import java.util.ArrayList;
public class ArrayListIntro{
    public static void main(String[] args){
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);                 // prints [1, 2, 3, 4, 5]
        //get element
        System.out.println(list.get(3));    //4

        //remove element
        list.remove(3);
        System.out.println(list);                 //prints [1,2,3,5]

        //set element
        list.set(3,9);
        System.out.println(list);                 //prints [1,2,3,9]
        
        //contains element
        System.out.println(list.contains(10));  //prints false
        System.out.println(list.contains(3));   //prints true

        //insert add not removing any element with index number
        list.add(2, 10);
        System.out.println(list);                 //prints [1,2,10,3,9]
    }
}