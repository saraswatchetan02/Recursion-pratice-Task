package Recursion;

import java.util.Scanner;

public class BinaryTo_decimal {
    static int binaryToDecimal(String s, int index) {
        if (index == s.length()) {
            return 0;
        }

        int bit = s.charAt(index) - '0';
        return bit * (int)Math.pow(2, s.length() - 1 - index)
               + binaryToDecimal(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(binaryToDecimal(s, 0));

        sc.close();
    }

}
