class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        int x,y;
        int num = 2;
        while(true){
            if(area%num == 0){
                x = area/num;
                y = num;
                if(2*x + 2*(y-2) == brown){
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
            num++;
        }

        return answer;
    }
}
