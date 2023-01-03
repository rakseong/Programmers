import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int k=0;
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<ingredient.length;i++){
            stack.push(ingredient[i]);
            if(stack.size()>=4 && stack.elementAt(k)==1 && stack.elementAt(k-1)==3 && stack.elementAt(k-2)==2 && stack.elementAt(k-3)==1){
                answer++;
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                k -= 4;
            }
            k++;
        }
        return answer;
    }
}
