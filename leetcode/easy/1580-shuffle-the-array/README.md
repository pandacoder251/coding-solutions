# Q2. Shuffle the Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the array `nums` consisting of `2n` elements in the form `[x1,x2,...,xn,y1,y2,...,yn]`.

 *Return the array in the form*  `[x1,y1,x2,y2,...,xn,yn]`.

 

 **Example 1:** 

```
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

```

 **Example 3:** 

```
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]

```

 

 **Constraints:** 

- 1 <= n <= 500
- nums.length == 2n
- 1 <= nums[i] <= 10^3

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 10.92%)  
**Memory:** 46.5 MB (beats 61.14%)  
**Submitted:** 2026-10-11T12:07:53.237Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/shuffle-the-array/)