class Solution {
    public String solution(String s) {
        String answer = "";
         char[] mid = s.toCharArray();
        if(s.length() % 2 == 0){
            answer += mid[(s.length()/2)-1];
            answer +=mid[s.length()/2];
            }
        else
            answer +=(mid[s.length() / 2]);
        return answer;
    }
}
