package com.company.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array numbers = new Array(2);
        numbers.insert(34);
        numbers.insert(33);
        numbers.insert(39);
        numbers.insert(31);
        numbers.insert(30);
//        System.out.println(numbers.intersect(new int[]{34, 2,31,34}));
//        numbers.reverse();
        numbers.insertAt(76, 2);
        numbers.print();
    }
}
