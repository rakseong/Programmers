import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int answer = 0;
        int j=0;
        int m = n;
        while(true){
            n = m%3;
            m = m/3;
            arr.add(n);
            if(m == 0)
                break;
        }

        for(int i=arr.size()-1;i>=0;i--){
            answer += arr.get(i)*Math.pow(3,j);
            j++;
        }

        return answer;
    }
}
