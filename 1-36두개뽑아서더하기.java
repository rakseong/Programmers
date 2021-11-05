import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0 ;i<numbers.length;i++){
            for(int j = i ;j<numbers.length-1;j++){
                int re = (numbers[i]+numbers[j+1]);
                if(!arr.contains(re))
                    arr.add(re);
            }
        }

        int[] answer = new int[arr.size()];
        for(int i = 0 ;i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
