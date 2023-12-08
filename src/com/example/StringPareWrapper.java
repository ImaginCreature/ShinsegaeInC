package com.example;

public class StringPareWrapper {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "20";
        byte b1 = Byte.parseByte(s1);
        byte b2 = Byte.parseByte(s2);
        byte b3 = (byte)(b1 + b2);

        int result = Integer.parseInt(s1) + Integer.parseInt(s2);
        //method does better performance.
        System.out.println(result);

        // + operator in java has 2 functions
        // 1. If Operand are all numbers, + operates.
        // 2. If Operand aren't all numbers, rest operands are casted to String.
        int value = 3 + 7;
        String str1 = "3" + 7;
        System.out.println(str1);

        int value1 = Integer.parseInt("10");
        System.out.println(value1);

        double value2 = Double.parseDouble("3.14");
        System.out.println(value2);

        boolean value3 = Boolean.parseBoolean("true");
        System.out.println(value3);

        String str2 = String.valueOf(10);
        System.out.println(str2);
        String str3 = String.valueOf(3.14);
        System.out.println(str3);

    }

}
