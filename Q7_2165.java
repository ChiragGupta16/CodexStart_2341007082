/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/2165/
 */
import java.util.Scanner;

public class Q7_2165 
{

    public static void toh(int n, int left, int middle, int right)
    {   
        if(n==1)                                          
        {
            System.out.println(left + " "+ right);                      
            return ;
        }
        toh(n-1, left, right, middle);                   //moving all chote disc to 2 with help of 3
        System.out.println(left + " " + right);                
        toh(n-1, middle, left, right);                  // 2 walon ko 3 pe leke jane
        
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(((int)(Math.pow(2,n)))-1);    //printing no of steps in first line
        toh(n, 1, 2, 3);
       
    }
}
