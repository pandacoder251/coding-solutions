/*class Solution{
    public boolean containsDuplicate (int nums[]){
        //brute force
      int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j< n ; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
        */


        //optimized

        import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
