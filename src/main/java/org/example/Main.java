package org.example;

import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /* Первый семинар.
        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        */
        int k = 2000;
        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
        System.out.println(i);

        String a = String.valueOf(i);
        int n = a.length();
        System.out.println(n);

        //i до Short.MAX_VALUE

        String s = "";

        for (int j = i, h = 0; j <= Short.MAX_VALUE; j++){
            if (j % n == 0)   s += String.valueOf(j)+",";
        }
        String [] m1 = s.split(",");

        s = "";
        for (int j = i, h = 0; j >= Short.MIN_VALUE; j--){
            if (j % n != 0)   s += String.valueOf(j)+",";
        }
        String [] m2 = s.split(",");

        }
    }
