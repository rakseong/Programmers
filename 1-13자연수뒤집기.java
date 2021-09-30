class Solution {
    public int[] solution(long n) {
        int l = (int)Math.log10(n);
        int[] answer = new int[l+1];

        for(int i =0;i<l+1;i++){
            answer[i]= (int)(n%10);
            n = (int)(n/10);
        }
        return answer;
    }
}
