import java.io.*;
import java.util.*;

public class Anagram
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String 1 :");
        String str1 = s.nextLine();
        System.out.println("Enter String 2 :");
        String str2 = s.nextLine();
        String str3=str1;
        String str4=str2;
        str1=str1.replaceAll(" ","");
        str2=str2.replaceAll(" ","");
        int l1=str1.length();
        int l2=str2.length();
        if(l1!=l2)
        {
            System.out.println("Not an Anagram");
        }
        else
        {
            str1=str1.toUpperCase();
            str2=str2.toUpperCase();
            char []ch1=str1.toCharArray();
            char []ch2=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            int i;
            Boolean flag=false;
            for(i=0;i<l1;i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
               System.out.println("Not an Anagram");
            else
                System.out.println(str3+" and "+str4+" are Anagrams");
                
        }
        
        
        
    }
}