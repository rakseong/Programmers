class Solution {
    public boolean solution(int x) {
        int y = x;
        int sum =0;
        for(int i =4;i>=0;i--){
            sum += (int)(x/Math.pow(10,i));
            x = (int)(x%Math.pow(10,i));
        }
        boolean answer = true;
        if(y % sum == 0)
            return answer;
        else
            answer = false;
        return answer;
    }
}
