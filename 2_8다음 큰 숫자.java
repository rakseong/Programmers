class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = n+1;
        String result = Integer.toBinaryString(n);
        int ncnt = result.length()-result.replace("1","").length();
        while(true){
            String nextnum = Integer.toBinaryString(tmp);
            if(nextnum.length()-nextnum.replace("1","").length() == ncnt){
                answer = tmp;
                break; 
            }
            tmp++;
        }
        return answer;
    }
}
