package Recursion;

public class replace_a_character {
	static String fxn(String str, char oldCh, char newCh, int i) {
        if (i == str.length()) {
            return "";
        }
        if (str.charAt(i) == oldCh) {
            return newCh + fxn(str, oldCh, newCh, i + 1);
        }
        return str.charAt(i) + fxn(str, oldCh, newCh, i + 1);
    }
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(fxn(str, 'a', 'x', 0));
    }	
}
