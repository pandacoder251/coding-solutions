
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num1 = new int[n];
        int[] num2 = new int[n];

        // Separate the x and y elements
        for (int i = 0; i < n; i++) {
            num1[i] = nums[i];
            num2[i] = nums[i + n];
        }

        // Combine them alternately
        int[] new_arr = new int[nums.length];

        for (int i = 0; i < n; i++) {
            new_arr[2 * i] = num1[i];
            new_arr[2 * i + 1] = num2[i];
        }

        return new_arr;
    }
}
