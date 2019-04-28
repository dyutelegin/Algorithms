<<<<<<< HEAD
package com.chapter1.arraysAndstrings;
import java.util.Arrays;

public class Two {
    private static String sort(String s) {
        char[] string = s.toCharArray();
        Arrays.sort(string);
        return new String(string);
    }

    private static boolean permutation (String a,String b) {
        if (a.length() != b.length()) {
            return false;
        }
        return sort(a).equals(sort(b));
    }
    public static void main(String[] args){
        System.out.println(permutation("test1", "test_1"));
        System.out.println(permutation("test", "test"));
    }
}
=======
package com.chapter1.arraysAndstrings;
import java.util.Arrays;

public class Two {
    private static String sort(String s) {
        char[] string = s.toCharArray();
        Arrays.sort(string);
        return new String(string);
    }

    private static boolean permutation (String a,String b) {
        if (a.length() != b.length()) {
            return false;
        }
        return sort(a).equals(sort(b));
    }
    public static void main(String[] args){
        System.out.println(permutation("test1", "test_1"));
        System.out.println(permutation("test", "test"));
    }
}
>>>>>>> origin/master
