import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] o = {1,2,3,4,5};
        int[] t= {2,1,2,3,2,4,2,5};
        int[] r= {3,3,1,1,2,2,4,4,5,5};
        int right1 = 0,right2 = 0,right3 = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0; i<answers.length;i++){
            if(answers[i] == o[i%5])
                right1++;
            if(answers[i] == t[i%8])
                right2++;
            if(answers[i] == r[i%10])
                right3++;
        }
        int max= Math.max(Math.max(right1,right2),right3);
        if(right1 == max)
            arr.add(1);
        if(right2 == max)
            arr.add(2);
        if(right3 == max)
            arr.add(3);
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
