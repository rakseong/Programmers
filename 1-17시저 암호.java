class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int len = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ' ')
                answer += " ";

            if(97<=(int)s.charAt(i) && (int)s.charAt(i)<=122){
                len = (int)s.charAt(i)+n;
                if(122<len)
                    len = len-26;
                answer += (char)len;
            }

            if(65<=(int)s.charAt(i) && (int)s.charAt(i)<=90){
                len = (int)s.charAt(i)+n;
                if(90<len)
                    len = len-26;
                answer += (char)len;
            }
            len=0;
        }
        return answer;
    }
}
