package com.chapter1.arraysAndstrings;

public class Five {
    private static String l1, l2; // длинные, короткие строки
    private static boolean different; //различие между строками
    private static int index1, index2; //указатель 1, 2 строки

    private static boolean isModify(String s1, String s2){
        if (Math.abs(s1.length() - s2.length())>1){
            return false;
        }
        different = false;
        index1 = 0;
        index2 = 0;
        l1 = s1.length() < s2.length() ? s1 : s2;
        l2 = s1.length() < s2.length() ? s2 : s1;

        while (index1<l1.length() && index2<l2.length()){
            if(l1.charAt(index1) != l2.charAt(index2)){
                if (different) return false;
                different = true;

                if(l1.length() == l2.length()){
                    index1++;
                }
            } else index1++;
            index2++;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isModify("pale", "ple"));
        System.out.println(isModify("pale", "bale"));
        System.out.println(isModify("pales", "pale"));
        System.out.println(isModify("pale", "bake"));
    }
}
