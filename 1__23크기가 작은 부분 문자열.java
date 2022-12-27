class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pl = p.length();
        Long np = Long.parseLong(p);
        for(int i =0; i<t.length()-pl+1;i++){
            if(Long.parseLong(t.substring(i,i+pl)) <= np)
                answer++;
        }

        return answer;
    }
}
