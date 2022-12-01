import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> stack = new Stack<>();
        if(s.charAt(0) == ')' || s.length()%2 == 1)
            return false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack.push(i);
            else if(s.charAt(i)==')' && !stack.empty())
                stack.pop();
            else
                continue;
        }

        if(!stack.empty())
            answer = false; 

        return answer;
    }
}
