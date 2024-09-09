package com.bridgelabz.logicpractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two String to Check for Anagram..");
        String str1=sc.next();
        String str2=sc.next();
        str1=str1.trim().toLowerCase();
        str2=str2.trim().toLowerCase();
        if(str1.length()==str2.length())
        {
            char[] charArray1=str1.toCharArray();
            char[] charArray2=str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result= Arrays.equals(charArray1, charArray2);

            if(result)
            {
                System.out.println(str1+" and "+str2+" are a Anagram Strings..");
            }
            else
            {
                System.out.println(str1+" and "+str2+" areNot a Anagram String...!! ");

            }
        }
        else
        {
            System.out.println(str1+" and "+str2+" are not a Anagram String..!!");
        }

    }
}
