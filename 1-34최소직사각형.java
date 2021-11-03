class Solution {
    public int solution(int[][] sizes) {

        int[][] result = new int[sizes.length][2];
        for(int i =0;i<sizes.length;i++){
            if(sizes[i][0]>=sizes[i][1]){
                result[i][0] = sizes[i][0];
                result[i][1] = sizes[i][1];
            } else{
                result[i][0] = sizes[i][1];
                result[i][1] = sizes[i][0];
            }
        }
        int maxrow = result[0][0];
        int maxcol = result[0][1];
        for(int i=0;i<sizes.length;i++){
            maxrow = maxrow>=result[i][0]?maxrow:result[i][0];
        }
        for(int i=0;i<sizes.length;i++){
            maxcol = maxcol>=result[i][1]?maxcol:result[i][1];
        }

        return maxrow*maxcol;
    }
}
