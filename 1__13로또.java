class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int worst=0,cnt=0,best;
        for(int i : lottos){
            if(i == 0){
                cnt++;
                continue;
            }
            for(int j : win_nums){
                if(i == j)
                    worst++;
            }
        }
        best = worst + cnt; // 0~6

        if(best == 0 ){
            answer[0] = 6;
        }else
            answer[0] = 7 - best;

        if(worst == 0 ){
            answer[1] = 6;
        }else
            answer[1] = 7 - worst;


        return answer;
    }
}
