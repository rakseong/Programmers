class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cnt = 0;
        while(a<=n){
            cnt = n%a;//남아있는 병
            answer = answer + (n/a)*b;//새로 받은 병
            n = cnt + (n/a)*b;
        }
        return answer;
    }
}
