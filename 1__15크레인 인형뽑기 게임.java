class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int j,temp = 0;
        int[] result = new int[moves.length];
        for(int i : moves){
            for(j=0;j<board.length;j++){
                if(board[j][i-1]==0) 
                    continue;
                else{
                    result[temp] = board[j][i-1];
                    board[j][i-1] =0;
                    break;
                }
            }
            if(j == board.length) continue;
            if(temp>0 && result[temp] == result[temp-1]){
                result[temp] = 0;
                result[temp-1] =0;
                answer++;
                temp -= 1;
            }
            else
                temp++;
        }
        return answer*2;
    }
}
