package com.singh.javain1video.arrays;

public class Array {
    public static void main(String[] args) {
        // Arrays are used yo store, same type of fixed size data

        int[] a = new int[5];
        // 0,0,0,0,0
        a[4] = 55;
        // 0,0,0,0,55
        System.out.println(a[4]);
        // To print whole array
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        // same by forEach loop
        for(int i : a){
            System.out.print(i + ", ");
            System.out.println();
        }

        // can directly initialize arrays like this
        int[] arrValues = {2, 4, 14, 21};
        for (int j : arrValues){
            System.out.print(j + " ");
        }

    }
}
