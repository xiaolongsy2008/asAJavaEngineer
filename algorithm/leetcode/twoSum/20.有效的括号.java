import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0){return false;} // 判断总符号个数是否为偶数]

        /**
         * 基于Stack 未做任何优化的实现方式：
         * 
         */
        // int i=0;
        // Stack<Character> sstack = new Stack<>();
        // while(i<s.length()-1){
        // Character cchar = s.charAt(i);
        // Character topChar = null;
        // if(!sstack.empty()){
        // topChar = sstack.peek();
        // }
        // if(topChar!=null){
        // if(topChar.equals('(')&&cchar.equals(')')){
        // sstack.pop();
        // }else if(topChar.equals('[')&&cchar.equals(']')){
        // sstack.pop();
        // }else if(topChar.equals('{')&&cchar.equals('}')){
        // sstack.pop();
        // }else{
        // sstack.push(cchar);
        // }

        // }else{
        // sstack.push(cchar);
        // }
        // i++;
        // }
        /**
         * 问题： 之前的实现方式中：逻辑存在无效的入栈操作：右括号不应该入栈 改进： 入栈前判断是否为左括号，遇到右括号无法与栈顶元素匹配时退出执行
         * 结论： 
         * 效率提升不明显
         **/
        // Stack<Character> sstack = new Stack<>();

        // Map<Character, Character> mmap = new HashMap<>();
        // mmap.put('}', '{');
        // mmap.put(')', '(');
        // mmap.put('[', ']');
        // for (int i = 0; i < s.length(); i++) {
        //     Character cchar = s.charAt(i);
        //     Character last = null;
        //     if(cchar.equals('{')||cchar.equals('[')||cchar.equals('(')){
        //         sstack.push(cchar);
        //     }else{
        //         if(!sstack.empty()){
        //             last = sstack.peek();
        //             if(last.equals(mmap.get(cchar))){
        //                 sstack.pop();
        //             }else{
        //                 return false;
        //             }
        //         }else{
        //             return false;
        //         }
        //     }
        // }

        /**
         *  非栈 方式： 奇技淫巧
         *  replace（），【】，{}
         *  性能很差！怀疑replace需要遍历多遍字符串！
         */
        int times =  s.length()/2;
        for(int i=0;i<=times;i++){
            s = s.replace("()", "").replace("[]","").replace("{}", "");
            if(s.length()==0){
                break;
            }
        }
        return s.length()==0;
    }

}
// @lc code=end
