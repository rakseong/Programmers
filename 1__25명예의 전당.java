import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> sc = new ArrayList<>();

        for(int i=0; i<score.length;i++){
            if(sc.size()<k){
                sc.add(score[i]);
                Collections.sort(sc);
                answer[i] = sc.get(0);
            }
            else if(sc.size()==k){
                int min = sc.get(0);
                if(min<score[i]){
                    sc.remove(0);
                    sc.add(score[i]);
                    Collections.sort(sc);
                }
                answer[i] = sc.get(0);
            }
        }
        return answer;
    }

}
