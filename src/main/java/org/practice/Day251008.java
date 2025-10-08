package org.practice;

public class Day251008 {
    public static void main(String[] args) {
        //已知2
        String string1 = "ABC";
        String string2 = "ABC";
        boolean equals1_2 = (string1 == string2);
        System.out.println(equals1_2);
        String string3 = new String("ABC");
        boolean equals1_3 = (string1 == string3);
        System.out.println(equals1_3);
        boolean equals1_4 = (string1.equals(string3));
        System.out.println(equals1_4);
        String string4 = new String("ABC");
        System.out.println(string4 == string3);
    }
}
