import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] s2 = new char[s.length()];
        int cnt=0;
        s.getChars(0,s.length(),s2,0);
        for(int i=0;i<s.length();i++){
            cnt++;
            if(s2[i] == ' '){
                cnt=0;
                answer += " ";
                continue;
            }
            if(cnt%2 == 1){     
                answer += Character.toString(Character.toUpperCase(s2[i]));
            }
            else{
                answer += Character.toString(Character.toLowerCase(s2[i]));
            }

        }
        return answer;
    }
}
