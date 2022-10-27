class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] e_answer = new int[n];
        
        for(int i=0;i<n;i++){
            e_answer[i] = arr1[i] | arr2[i];
        }
        
        for(int j=0; j<n;j++){
            String sum = "";
            for(int k =(int)Math.pow(2,n-1); k>0;k/=2){
                
                if( e_answer[j]/k == 1){
                    sum += "#";
                    e_answer[j] %= k;
                } else
                    sum += " ";
            }
            answer[j] = sum;
        }
        
        return answer;
    }
}
