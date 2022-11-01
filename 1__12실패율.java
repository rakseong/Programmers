import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] cnt = new int[N+1]; //스테이지별 도달한 사람
        double[] fail = new double[N];// 실패율
        
        for(int i =0; i<N;i++)
            answer[i] = i+1;
        
        for(int i =0;i<=N;i++){
            int temp = 0;
            for(int j=0; j< stages.length;j++){
                if(i+1 == stages[j])
                    temp++;
            }
            cnt[i] = temp;
        }
        int z = Arrays.stream(cnt).sum();
        for(int i=0;i<N;i++){
            if(z==0){
                fail[i] = 0;
                continue;
            }
            fail[i] = (double)cnt[i]/z;
            z -= cnt[i];
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N-1; j++){
                if(fail[j]<fail[j+1]){
                    double t=fail[j+1];
                    fail[j+1] = fail[j];
                    fail[j] = t;
                    int x=answer[j+1];
                    answer[j+1] = answer[j];
                    answer[j] = x;
                }   
            }
        }
        
        
        return answer;
    }
}
