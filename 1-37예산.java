import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int cnt=0;
        for(int i=0;i<d.length;i++){
            answer += d[i];
            if(answer>budget){
                cnt = i;
                break;
            }
            if(answer==budget){
                cnt = i+1;
                break;
            }
        }
        if(answer<budget)
            cnt = d.length;
        return cnt;
    }
}
