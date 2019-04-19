package com.chapter1.arraysAndstrings;

public class One {
    public static boolean isExist(String str){
            boolean[] symbol = new boolean[256];
            for (int i = 0; i < str.length(); i++) {
                int vol = str.charAt(i);
                if (symbol[vol]) {
                    return false;
                }
                symbol[vol] = true;
            }
            return true;
        }
     public static void main(String[] args){
        System.out.println(isExist("Aba"));
        System.out.println(isExist("Alfhabet"));
        System.out.println(isExist("Morris"));
     }
}
