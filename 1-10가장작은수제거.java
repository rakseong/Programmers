class Solution {
    public int[] solution(int[] arr) {
        int min=0,j=0;

        int[] answer = new int[arr.length-1];

        if(arr.length <= 1){
            return new int[]{-1};
        }

        for(int i=0;i<arr.length;i++){
            if(arr[min] > arr[i]) {
                    min = i;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i==min)
                continue;
            answer[j] = arr[i];
            j++;
        }
        return answer;
    }
}
