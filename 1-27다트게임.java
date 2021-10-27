class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] num = new int[3];
        int cnt=-1;
        char[] dart = dartResult.toCharArray();

        for(int i =0; i<dartResult.length();i++){
            if(dart[i]>= '0' && dart[i]<= '9'){
                cnt++;
                if(dart[i] == '1' && dart[i+1] == '0'){
                    num[cnt] = 10;
                    i++;
                }
                else
                    num[cnt] = dart[i]-'0';
            }

            if(dart[i] == 'D')
                num[cnt] = (int)Math.pow(num[cnt],2);

            else if (dart[i] == 'T')
                num[cnt] = (int)Math.pow(num[cnt],3);

            else if (dart[i] == '#')
                num[cnt] *=  -1;

            else if (dart[i] == '*'){
                num[cnt] *= 2;
                if(cnt!=0)
                    num[cnt-1] *=2;
            }
        }

        answer = num[0] + num[1] + num[2];

        return answer;
    }
}
