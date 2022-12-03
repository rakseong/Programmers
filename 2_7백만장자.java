import java.util.*;
import java.io.FileInputStream;
 
class Solution
{
    static int N;
    public static void main(String args[]) throws Exception
    {
     
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            int[] price = new int[N];
            long answer=0;
            int max=0;
            for(int i =0; i<N; i++){
                price[i] = sc.nextInt();    
            }
            max = price[N-1];
            for(int i =N-2; i>=0; i--){
                if(price[i]>= max){
                    max = price[i];    
                }else
                    answer += max-price[i];
            }
            System.out.println("#"+test_case+" "+ answer);
        }
    }
}
