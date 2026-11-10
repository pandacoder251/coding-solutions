/*
//Bruteforce
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
*/
//optimized

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hp = new HashMap<>(); 
        int n = nums.length;
        
        for (int i = 0; i < n; i++) { 
            int goal = target - nums[i];
            
            if (hp.containsKey(goal)) {
                return new int[] { hp.get(goal), i };
            }
            hp.put(nums[i], i); 
        }
        return new int[] {};
    }
}
