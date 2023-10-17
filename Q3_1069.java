/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1069/
 */
import java.util.*;
public class Q3_1069
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=0, count=0;
        String s = sc.nextLine();                              //s stores DNA string
        for(int i=0; i<s.length()-1; i++)                        // loop for accessing characters of s
        {   
            if(s.charAt(i) == s.charAt(i+1))                   //check if its a continous repetion
            {
                count++;                                       // count no of times its repeated
            }
            if(max<count)
            {
                max = count;                                   // stores maximum repetition as max 
            }
            if(s.charAt(i)!=s.charAt(i+1))
            {
                count = 0;                                     // reinitialises count if repetions break
            }
        }
        System.out.print(max+1);                              // 1 is added to add the intial char 
    }                                                         // that was repeated
}
