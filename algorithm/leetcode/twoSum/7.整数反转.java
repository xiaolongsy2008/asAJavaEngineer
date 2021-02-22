/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        if(0==x){
            return 0;
        }
        if(0==x/10){
            return x;
        }
        int result = 0;
        Stack<Integer> sstack  = new Stack();
        while(x/10!=0){
          sstack.push(x%10);
          x=x/10;
        }
        sstack.push(x);
        int popTimes = 0;
        while(!sstack.empty()){
            result+=sstack.pop()*Math.pow(10,popTimes);
            popTimes++;
        }
        if (result>=Integer.MAX_VALUE||result<=Integer.MIN_VALUE){
            return 0;
        }
        return result;
    }
}
// @lc code=end

