import java.util.ArrayList;

public class ContainerMostWater {
    //BRUTE FORCE APPROACH  O(n^2)

    // public static int maxArea(ArrayList<Integer> height) {
    //     int maxWater = 0;
    //     //brute force
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(i));
    //             int width = j-i;
    //             int currwater = ht * width;
    //             maxWater = Math.max(maxWater, currwater);
    //         }
    //     }
    //     return maxWater;
    // }

    //LINEAR APPROACH (2 POINTER APPROACH) O(n)
    public static int maxArea(ArrayList<Integer> height){
        int maxWater = 0;
        int left = 0;
        int right = height.size() - 1;
        while(left < right ){
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if(height.get(left) < height.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxArea(height));
    }
}
