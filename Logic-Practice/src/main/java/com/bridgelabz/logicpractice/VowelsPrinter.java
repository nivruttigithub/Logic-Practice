package com.bridgelabz.logicpractice;

public class VowelsPrinter {
    public static void main(String args[])
    {
        String str = " Welcome to Java World";
        str = str.trim();

        printVowels(str);
    }
    public static void printVowels(String str)
    {
        String vowels = "aeiouAEIOU";

        for(int i=0;i<=str.length()-1;i++)
        {
            char ch = str.charAt(i);

            if(vowels.indexOf(ch) != -1)
            {
                System.out.print(ch+" ");
            }
        }
    }
}
