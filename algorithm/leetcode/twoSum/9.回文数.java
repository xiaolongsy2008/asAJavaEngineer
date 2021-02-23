/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // 负数不满足回文数定义
        if(x<0){
            return false;
        }
        int initialX = x;
        int reverseX = 0;
        while(x!=0) {
            int temp = x%10;
            if(reverseX>Integer.MAX_VALUE/10||reverseX==Integer.MAX_VALUE/10&&temp>7){
                return false;
            }
            reverseX = 10*reverseX + temp;
            x/=10;
        }
        return initialX == reverseX;

    }
}
// @lc code=end

