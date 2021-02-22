import java.util.Map;
import java.util.HashMap;
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        /**
         *  双重循环暴力解法
         */
        // for(int i=0; i< nums.length;i++){
        //     for(int j=nums.length-1;j>i;j--){
        //         if(nums[i]+nums[j]==target){
        //             indexs[0]=i;
        //             indexs[1]=j;
        //             return indexs;
        //         }
        //     }
        // }

        /**
         *  优化解法：
         */
        Map<Integer,Integer> values = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(values.get(diff)!=null){
                indexs[0] = i;
                indexs[1] = values.get(diff);
                return indexs;
            }

        }
        return indexs;
    }
}
// @lc code=end

