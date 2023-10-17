/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1618/
 */
import java.util.*;
public class Q5_1618
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();                        //stores integer
        long count =0, finalCount=0;
        for(int x=5; x<=n; )                           //loop to divide n by power of 5
        {
            count = n/x;
            finalCount= finalCount+count;           
            x= x*5;
        }
        System.out.print(finalCount);                   //prints trailing zero
    }
}