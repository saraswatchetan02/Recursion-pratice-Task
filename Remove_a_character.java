package Recursion;

import java.util.Scanner;

public class Remove_a_character {
	 static String fxn(String str, char ch, int i) {
	        if (i == str.length()) {
	            return "";
	        }
	        if (str.charAt(i) == ch) {
	            return fxn(str, ch, i + 1);
	        }
	        return str.charAt(i) + fxn(str, ch, i + 1);
	    }
	    public static void main(String[] args) {
	        String str = "banana";
	        char ch = 'a';
	        System.out.println(fxn(str, ch, 0));
	    }
	}
