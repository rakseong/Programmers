class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n+1];

        for(int i=2; i<=n; i++) 
            numbers[i]=i;

        for(int i=2; i<n; i++) {
            if(numbers[i] == 0) continue;
            for(int j=2*i; j<=n; j+=i) 
                numbers[j] = 0;
        }

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] != 0) answer++;
        }  
        return answer;
    }
}//에라토스테네스의 체 사용

/*int i,j;
        int[] s = new int[n]
        for(i =3;i<=n;i++){
            if(i%2 == 0)
                continue;
            for(j = 3;j<=i/2;j++){
                if(i%j ==0)
                    break;
            }
            if(j > i/2)
                answer += 1;
        }직접 짠 코드 (효율성 검사 탈락)*/
