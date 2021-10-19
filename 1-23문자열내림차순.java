import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Character[] num = new Character[s.length()];

        for(int i =0; i<s.length();i++)
            num[i] = s.charAt(i);

        Arrays.sort(num,Collections.reverseOrder());

        for(int i =0; i<s.length();i++)
            answer += num[i];

        return answer;
    }
}
