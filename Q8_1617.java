/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1617/
 */
import java.util.*;
public class Q8_1617
{
   public static void main(String[] args)
   {
    final int mod = 1000000007;                          //using modulo
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count =1;
    for(int i =0;i<n;i++)
    {
     count= (count*2)%mod;
    }
    System.out.println(count);
   }
}
