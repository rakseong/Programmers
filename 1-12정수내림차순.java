import java.util.Arrays;
class Solution {
    public long solution(long n) {
        int val= (int)(Math.log10(n)+1);
        long[] num = new long[(int)val];
        long answer = 0;

        for(int i=0;i<val;i++){
            num[i] = (long)(n%10);
            n = n/10;
        }

        Arrays.sort(num);

        for(int i=0;i<val;i++){
            answer = answer+(long)(num[i]*Math.pow(10,i));
        }

        return answer;
    }
}
