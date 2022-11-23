import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toUpperCase();
        StringTokenizer jaden = new StringTokenizer(s," ",true);
        while(jaden.hasMoreTokens()){
            String result = jaden.nextToken();
            answer = answer + result.substring(0,1) + result.substring(1).toLowerCase();
        }

        return answer;
    }
}
