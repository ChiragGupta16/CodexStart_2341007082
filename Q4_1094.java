/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1094/
 */
import java.util.*;
public class Q4_1094
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();                       //stores length of array
         long ar[] = new long[n];
         long count1 =0, count2=0;
         for(int y=0;y<n;y++)                        //loop takes input
         {
            ar[y] = sc.nextLong();
         }
         for(int x =1;x<n;x++)                        //loop access elements
         {
            if(ar[x] < ar[x-1])
            {
                count1 = ar[x-1] - ar[x];                         //stores no of moves
                ar[x]= ar[x-1];
            }
            count2 = count2 + count1;
            count1=0;
         }
         System.out.print(count2);
    }
}
