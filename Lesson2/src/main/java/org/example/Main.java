package org.example;

import java.util.Scanner;

public class Main {

    /*
        Задача 8.
        Проверка, является ли число простым (делится только на 1 и само себя)
     */

    public static void main(String[] args) {
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(8)); // false
        System.out.println(isPrime(9)); // false
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(15)); // false
    }

    public static boolean isPrime(int number) {
        if (number == 1 || number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= (int) Math.sqrt(number); i = i + 2) {
            if (number % i == 0) return false;
        }

        return true;
    }

    public static boolean isPalindrome(String value) {
        if (value == null || value.isEmpty()) return false;

        for (int i = 0; i < value.length() / 2; i++) {
            if (value.charAt(i) != value.charAt(value.length() - 1 - i)) return false;
        }

        return true;
    }

}