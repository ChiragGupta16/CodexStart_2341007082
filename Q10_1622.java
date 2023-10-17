/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/1622/
 */
import java.util.*;
public class Q10_1622
{
    public static void Arrange(String str,int index, String arrangedStr, HashSet<String> uniqueStr)
    {
        if(str.length()==0)
        {
            if(uniqueStr.contains(arrangedStr))          //used hashset to remove duplicates
            {
                return;
            }
            else{
            System.out.println(arrangedStr);
            uniqueStr.add(arrangedStr);
            return;
            }
        }
        for(int i=0; i<str.length();i++)                 //loop to accsess chars of string
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);   //creating new input by removing the to be printed char
            Arrange(newStr,index+1, arrangedStr+currChar,uniqueStr);                
        }
    }

    public static String sortString(String inputString)    //function to sort string
    {
        char Arrsrt[] = inputString.toCharArray();
        Arrays.sort(Arrsrt);
        return new String(Arrsrt);
    }

    public static void main ( String[] args)
    {
        int fact =1;
        int ctr =1;
        Scanner sc = new Scanner (System.in);
        HashSet<String> uniqueStr = new HashSet<>();
        String str = sc.nextLine();
        int bk = str.length();
        HashSet<Character> repeat = new HashSet<>();
        for( int i=0;i<str.length();i++)                       //to calculate total combinations
        {
            if(repeat.contains(str.charAt(i)))
            {
                ctr++;
            }
            else{
                 repeat.add( str.charAt(i));
            }
        }
        for(int i=bk;i>=ctr;i--){
           fact = fact*i;
        }
        if(ctr==3)
         System.out.println(fact/2);
        else
          System.out.println(fact/ctr);
        
        String str2 = str;
         str = sortString(str2);
        

        Arrange(str, 0,  "",uniqueStr);
    }
}
