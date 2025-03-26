package com.singh.javain1video.datatypes;

public class test {
    public static void main(String[] args) {

        System.out.println(1 != 3);
        // Relational Operators: < > <= >= == !=

        boolean isRainy = true;
        boolean isHumid = true;
        boolean notGoOutside = isHumid || isRainy;
        System.out.println(notGoOutside);
        System.out.println(!isHumid);
        // Logical Operators: && || !

//        int a = 5; //101
//        int b = 4; //100
//                    // 100 = "AND operation(&)"
//                    // 101 = "OR operation(|)"
//                    // 001 = "XOR operation(^)"
//                    // 010 = "NOT operation on 5(~)"
//                    // 1010 = "Left Shift operator on 5(<<)"
//                    // 010 = "Right Shift operator on 5(>>)"
//
//        System.out.println(Integer.toBinaryString(a & b));
//        System.out.println(Integer.toBinaryString(a | b));
//        System.out.println(Integer.toBinaryString(a ^ b));
//        System.out.println(Integer.toBinaryString(~a));
//        System.out.println(Integer.toBinaryString(a << 1));
//        System.out.println(Integer.toBinaryString(a >> 1));
    }
}
