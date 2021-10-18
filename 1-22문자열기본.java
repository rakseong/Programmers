import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] num = s.toCharArray();
        if(s.length()==4 || s.length()==6){
            for(int i =0; i<s.length(); i++){
            if(Character.isDigit(num[i])==false){
                answer = false;
                break;
                }
            }
        } else
            answer = false;


        return answer;
    }
}
