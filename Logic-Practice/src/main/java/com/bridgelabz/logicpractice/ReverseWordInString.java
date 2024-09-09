package com.bridgelabz.logicpractice;

/*Reverse the Word From Given String Paragraph.
 * Input : Nivrutti Tanaji Wagh
 * Output : itturviN ijanaT hgaW */

public class ReverseWordInString {
    public static void main(String args[]) {
        String str = "Nivrutti Tanaji Wagh";
        str = str.trim();
        String words[] = str.split("\\s+");
        String revPara = "";

        for (int i = 0; i <= words.length - 1; i++) {
            String name = words[i];
            String rev = "";
            for (int j =name.length()-1;j>=0; j--) {
                rev = rev + name.charAt(j);
            }
            revPara = revPara + rev+" ";
        }
        System.out.println(revPara);
    }
}
