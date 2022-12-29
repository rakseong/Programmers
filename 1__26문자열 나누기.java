class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int fn=0,an=0;
        for(int i=0; i<s.length();i++){
            if(first == s.charAt(i))
                fn++;
            else
                an++;

            if(fn==an && i != s.length()-1){
                fn=0;
                an=0;
                first = s.charAt(i+1);
                answer++;
                continue;
            }

            if(i==s.length()-1){
                answer++;
                break;
            }

        }
        return answer;
    }
}
