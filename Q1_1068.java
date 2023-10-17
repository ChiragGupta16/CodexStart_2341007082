/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1068/
 */

 import java.util.*;             // for Scanner function
 public class Q1_1068
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();                                 //n input store karega
        System.out.print(n+" ");                               // first no print hua
        while(n!=1)
        {
         if (n%2==1)
         {
          n = n*3;
          n=n+1;
         }
         else
           {
            n = n/2;
           }
           System.out.print(n+ " ");                            //it prints from 2nd no onwards
       }
        
    }
 }