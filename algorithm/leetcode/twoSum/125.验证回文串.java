/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public static boolean isPalindrome(String s) {
        if ("".equals(s)) {
            return Boolean.TRUE;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char cchar = s.charAt(i);
            if (cchar >= 'A' && cchar <= 'Z') {
                stringBuilder.append((char)(cchar + 32));
            } else if (cchar >= 'a' && cchar <= 'z') {
                stringBuilder.append(cchar);
            } else if (cchar >= '0' && cchar <= '9') {
                stringBuilder.append(cchar);
            }
        }
        String str = stringBuilder.toString();
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
// @lc code=end
