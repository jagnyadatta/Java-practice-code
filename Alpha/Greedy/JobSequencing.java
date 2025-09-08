import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    public static void main(String[] args){
        int[][] jobs = {{4,20},{1,10},{1,40},{1,30}};

        Arrays.sort(jobs, Comparator.comparingDouble(o->o[1]));
        ArrayList<Integer> list = new ArrayList<>();
        int ans = jobs[jobs.length-1][1];
        int endLimit = jobs[jobs.length-1][0];
        list.add(0);

        for(int i = jobs.length-2; i >= 0; i--){
            if(jobs[i][0] > endLimit){
                ans += jobs[i][1];
                endLimit = jobs[i][0];
                list.add(i);
            }
        }

        System.out.println(ans);

        for(int i = 0; i < list.size(); i++){
            System.out.println("{"+jobs[list.get(i)][0]+","+jobs[list.get(i)][1]+"}");
        }
    }
}
