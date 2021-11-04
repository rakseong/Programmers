class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int total=0;
        for(int i =0; i<a-1 ; i++){
            total += month[i];
        }
        total += b;
        if(total%7 == 0)
            answer = day[6];
        else
            answer = day[(total%7)-1];


        return answer;
    }
}
