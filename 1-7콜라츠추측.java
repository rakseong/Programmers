class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        while(num > 1){
            if(cnt>=500)
                return answer = -1;
            if(num%2==0){
                num = num/2;
                cnt++;
            }
            else{
                num = num*3+ 1;
                cnt++;
            }
        }
        return answer = cnt;
    }
}
