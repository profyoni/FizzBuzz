package com.company;

public class Main {
// commit - records changes to your local machine repo
// push - records changes to remote repo

    public static String fb(int i)
    {
        String s = i + " ";
        if (i % 3 == 0)
            s += "fizz";
        if (i % 5 == 0)
            s += "buzz";
        return s;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fb(i));
        }
    }
}
