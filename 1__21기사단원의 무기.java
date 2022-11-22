class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] numcnt = new int[number];
        int cnt;
        for(int i=0; i<number;i++){
            cnt = 0;
            for(int j =1; j<=Math.sqrt(i+1);j++){
                if((i+1)%j==0){
                    if((i+1)/j == j)
                        cnt++;
                    else
                        cnt += 2;
                }
            }
            numcnt[i] = cnt;
        }

        for(int i : numcnt){
            if(i>limit)
                answer += power;
            else
                answer += i;
        }
        return answer;
    }
}
