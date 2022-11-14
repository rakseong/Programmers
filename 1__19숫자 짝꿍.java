class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        for(int i =9; i>=0; i--){
            String k = Integer.toString(i);

            if(X.indexOf(k) == -1 || Y.indexOf(k) == -1)
                continue;

            int t1 = X.length() - X.replace(k,"").length();
            int t2 = Y.length() - Y.replace(k,"").length();
            int tmp = t1-t2 >= 0 ? t2 : t1;
            for(int j =0; j<tmp; j++)
                answer.append(k);

        }
        if(answer.length() == 0)
            answer.append("-1");
        if(answer.charAt(0) == '0')
            answer.setLength(1);

        return answer.toString();
    }
}
