import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        // target = nums[index]+compliment
        // compliment = target-nums[index]
        // note : in the hashmap we store the array numbers and there indexes , not the compliment which is obtained at the index
        // if the compliment is not with in the hashmap , we add the number and it's index to the hashmap as key , value
        // again add the number and index , not the compliment at the index and the index.


        int compliment = 0;
        for(int i = 0 ; i < nums.length ; i++){
            compliment = target-nums[i];

            if (hm.containsKey(compliment)) {
                int arr[] = new int[2];
                arr[0] = i;
                arr[1] = hm.get(compliment);
                return arr;
            } else {
                hm.put(nums[i],i);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        TwoSum solution = new TwoSum();
        System.out.println(Arrays.toString(solution.twoSum(arr,4)));
    }
}
