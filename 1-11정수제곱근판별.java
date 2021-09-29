class Solution {
    public long solution(long n) {
        for(int i = 0; i<=n;i++){
            if(Math.sqrt(n) == i)
                return (long)Math.pow(i+1,2);
        }
        return -1;
    }
}
