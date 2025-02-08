import java.util.ArrayList;
import java.util.Arrays;

public class TargetPair {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        int target = 2;
        System.out.println(getTargetPairs(arr,target));
    }

    public  static int getTargetPairs(int []arr, int target){
        Arrays.sort(arr);
        ArrayList<String> uniquePairs = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(Math.abs(j-i) == target){
                    String currPair = Integer.toString(arr[i]).concat(Integer.toString(arr[j]));
                    if(!uniquePairs.contains(currPair)){
                        uniquePairs.add(currPair);
                    }
                }
            }
        }
        System.out.println(uniquePairs);
        return uniquePairs.size();
    }
}
