
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l =10;
        int r =12;

        for(int i: numbers){
            if(i ==1 || i ==4 || i==7){
                answer += "L";
                l = i;
            }else if(i==3 || i==6 || i==9){
                answer += "R";
                r = i;
            }else {
                if(i==0) 
                    i=11;
                int ldis = Math.abs(i-l)/3 + Math.abs(i-l)%3;
                int rdis = Math.abs(i-r)/3 + Math.abs(i-r)%3;

                if(ldis<rdis){
                    answer += "L";
                    l = i;
                } else if(ldis>rdis){
                    answer += "R";
                    r = i;
                } else{
                    if( hand.equals("right")){
                        answer += "R";
                        r = i;
                    }else{
                        answer += "L";
                        l = i;
                    }
                }
            }
        }
        return answer;
    }
}
