/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1070/
 */
import java.util.*;
public class Q6_1070
 {
    public static void main(String[] args) throws Exception            //beautifull numbers means alternate num
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();                        //using SB to avoid tle
        int n = sc.nextInt();
        if(n<4 && n>1)
        {
            System.out.print("NO SOLUTION");             // 2 will create problem with 1 and 3
        }
       else if(n==1)
       {
        System.out.print(n);
       }
       
        else
        {
            if(n%2==0)
            {
                for(int i=2; i<=n; i=i+2)
                {
                    sb.append(i).append(" ");                  //printing in ascending order
                }                                                  
                for(int j =1; j<=n-1; j=j+2)
                {
                    sb.append(j).append(" ");
                }
                System.out.print(sb);
            }
            else
            {
                for(int i =2; i<=n-1; i=i+2)
                {
                    sb.append(i).append(" "); 
                }
                for(int j=1; j<=n; j=j+2)
                {
                    sb.append(j).append(" "); 
                }
                System.out.print(sb);
            }
        }
 
    }
}
