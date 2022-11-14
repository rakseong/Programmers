class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1;i<food.length;i++){
            int j = food[i]/2;
            for(int k=0;k<j;k++)
                answer += Integer.toString(i);
        }
        answer += "0";
        for(int i=food.length-1; i>0;i--){
            int j = food[i]/2;
            for(int k=0;k<j;k++)
                answer += Integer.toString(i);
        }
        return answer;
    }
}
