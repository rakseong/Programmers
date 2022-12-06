import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        for(char i : s.toCharArray()){
            if(!stack.isEmpty() && i == stack.peek())
                stack.pop();
            else
                stack.push(i);
        }
        if(stack.isEmpty())
            answer = 1;
        else
            answer = 0;

        return answer;
    }
}
