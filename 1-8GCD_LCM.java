class Solution {
    public int[] solution(int n, int m) {
        int b = n>=m?n:m;
        int s = n<=m?n:m;
        int[] answer = new int[2];
        int max=0,min=0;
        int i = 1;

        while(i<=b){
            if(s%i==0 && b%i==0){
                max = i;
                }
            i++;
        }

        i=b;
        while(true){
            if(i%s==0 && i%b==0){
                min = i;
                break;
            }
            i++;
        }
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}
