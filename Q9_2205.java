/*
 * Name: Chirag Gupta
 * Reg No: 2341007082
 * PS LINK: https://cses.fi/problemset/task/2205/
 */

import java.util.*;
public class Q9_2205
{
   static ArrayList<String> greyCode(int n)
  {
    if(n==1)
    {
        ArrayList<String> initial = new ArrayList<>();
        initial.add("0");
        initial.add("1");
        return initial;
    }
    ArrayList <String> rec = greyCode(n-1) ;
    ArrayList<String> code = new ArrayList<>();
    for(int i =0; i<rec.size();i++)
    {
      code.add("0" + rec.get(i));                            //adding 0 before bit form of smaller n to make it n
    }
    for(int i= rec.size()-1; i>=0;i--)
    {
      code.add("1" + rec.get(i));                             // adding  1 before bit form of " " " "" "
    }
    return code;
  }

  public  static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    ArrayList<String> print = new ArrayList<>();
    print = greyCode(n);
    for(int i=0; i<print.size();i++)                      //loop to print generated grey code
    {
      System.out.println(print.get(i));
    }
  }
}