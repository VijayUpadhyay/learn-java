package org.vijay.cmd;

public class ArgumentIndexes {

    public static void main(String[] args) {
        //args[1] = "Day!";
        //args[2] = "Day!";
        System.out.println("Arr len: " + args.length);
        for (String s : args) {
            System.out.println(s);
        }

        // System.out.println(args[0] + " " + args[1]);
    }

    void testProtectedVar() {
        //protected int a = 10;  not allowed
        int a = 10;
        System.out.println(a);
    }
}
