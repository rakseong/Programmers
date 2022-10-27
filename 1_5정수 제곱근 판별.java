class Solution {
    public long solution(long n) {
        double i = Math.sqrt(n);
        long answer = (Math.sqrt(n)%1 == 0) ? (long)Math.pow(i+1,2)  : -1;
        return answer;
    }
}
