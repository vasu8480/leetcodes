import java.util.*;

class single-number {
    public static void main(String args[]) {
        int[] nums = {4,1,2,1,2,4,8};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i : set){
            ans = i;
        }

        return ans;
    }
    }



