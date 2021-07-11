package strings;

import java.util.ArrayList;

public class StringManipulation {

    public boolean isUnique(String s) {
        ArrayList<Character> tmp = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!tmp.contains(s.charAt(i))) {
                tmp.add(s.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }


    /**
     * consider both strings are of equal size
     */
    public boolean isPermutation(String s1, String s2) {
        ArrayList<Character> tmp = new ArrayList<>();

        if (s1.length() != s2.length()) {
            System.out.println();
            System.out.println("strings are of different sizes");
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            tmp.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!tmp.contains(s2.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length/2; i++) {
            int j = (length - 1) - i;
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }


    /**
     *  returns the ith fibonacci number
     *  runtime: O(2^n)
     */
    public int fibonacci(int i) {
        if (i < 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}
