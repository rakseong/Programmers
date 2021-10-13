class Solution {
    public String solution(int n) {
        String answer = "";
        String k = "";
        for(int i = 0;i<n;i++){
            k = i%2==0?"수":"박";
            answer += k;
        }
        return answer;
    }
}
