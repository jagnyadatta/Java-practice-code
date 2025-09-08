import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 590;
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < coins.length ; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    count++;
                    list.add(i);
                    amount = amount - coins[i];
                }
            }
        }

        System.out.println("Max Count :- "+count);

        for(int i = 0; i < list.size(); i++){
            System.out.print(coins[list.get(i)] + " ");
        }
    }
}
