import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 0;
        char start;
        char end = words[0].charAt(0);
        ArrayList<String> ans = new ArrayList<String>();

        for(String i : words){
            start = i.charAt(0);
            if(ans.contains(i) || start != end){
                break;
            }
            ans.add(i);
            cnt++;
            end = i.charAt(i.length()-1);
        }

        if(cnt == words.length){
            answer[0] = 0;
            answer[1] = 0;
        }
        else{
            answer[0] = cnt%n+1;
            answer[1] = cnt/n+1;
        }

        return answer;
    }
}
