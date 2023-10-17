/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1083/
 */
import java.util.*;
public class Q2_1083
{
    public static void main (String[] args) 
    {   
        Scanner sc= new Scanner(System.in);         
        int n = sc.nextInt();                        // n stores last number as input
        int sum1 = 0, sum2=0;                        
        for ( int i=1;i<n;i++)                       // loop to take input
        {
            int x = sc.nextInt();
            sum1 = sum1 + x;                         //sum1 - sum of input calculate karta hai
        }
        for(int y=1; y<=n; y++)
        {
            sum2 = sum2+y;                           // sum2 - sum of pura sum calculate karta hai
        }
        System.out.print(sum2-sum1);                 // And heres the output
    }
}