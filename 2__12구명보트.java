import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0,cnt=0;;
        int tmp=0;
        int retmp=people.length-1;
        Arrays.sort(people);
        for(int j=people.length-1;j>=tmp;j--){
            if(limit>= people[tmp]+people[j]){
                tmp++;
            }
            answer++;
        }
        return answer;
    }
}
