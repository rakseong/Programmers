import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt= 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%divisor == 0)
                cnt++;
        }

        if(cnt == 0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%divisor == 0){
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}
