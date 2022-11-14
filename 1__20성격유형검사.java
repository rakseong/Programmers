class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String type = "RTCFJMAN";
        int[] score = new int[8];
        for(int i=0;i<choices.length;i++){
            if(choices[i]<4)
                score[type.indexOf(survey[i].charAt(0))] += 4-choices[i];

            else if(choices[i]>4)
                score[type.indexOf(survey[i].charAt(1))] += choices[i]-4;
        }

        for(int j =0; j<score.length;j+=2){
            if(score[j]>= score[j+1]){
                answer += type.charAt(j);
            }
            else
                answer += type.charAt(j+1);
        }
        return answer;
    }
}
