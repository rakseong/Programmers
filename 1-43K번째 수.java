import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int cnt =0;
        for(int i =0;i<commands.length;i++){
            int n1 = commands[i][0]-1;
            int n2 = commands[i][1]-1;
            int idx = commands[i][2]-1;
            for(int j =n1;j<=n2;j++){
                list.add(array[j]);
            }
            list.sort(Comparator.naturalOrder());
            answer[cnt]= list.get(idx);
            cnt++;
            list.clear();
        }
        
        return answer;
    }
}
