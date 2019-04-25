package com.chapter1.arraysAndstrings;

public class Four {
    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("Tact Coa"));
        System.out.println(isPalindrome("доход"));
        System.out.println(isPalindrome("заказ"));
        System.out.println(isPalindrome("кабак"));
        System.out.println(isPalindrome("казак"));
        System.out.println(isPalindrome("комок"));
        System.out.println(isPalindrome("потоп"));
        System.out.println(isPalindrome("топор"));
    }
}
