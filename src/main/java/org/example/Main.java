package org.example;

import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        int k = 2000; //
        int i = new Random().nextInt(k); //выкидываем число от 0 до переменной k и сохраняем в переменную i
        System.out.println(i);           // вывод на экран значения переменной i

//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        String a = String.valueOf(i);  // преобр данные из переменной i в тип sting и сохраняем в переменной a
        int n = a.length();            /*определяем размер строки переменной a и сохроняем полученное значение
                                         типа int в переменной n */
        System.out.println(n);        // вывод на экран значения переменной n
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        String s = "";                // создаем пустую строку s в которую будем записывать подходящие условиям значения

        for (int j = i, h = 0; j <= Short.MAX_VALUE; j++){
            if (j % n == 0)   s += String.valueOf(j)+",";
        }                             /* проходим циклом в заданном диапазоне и добавляем в нее значения
                                         соответствующие условию */
        String [] m1 = s.split(","); /* создаем массив m1 в который помещаем значения строки s через разделитель
                                            "," при помощи метода .split() */

        s = "";                       // очищаем ранее заполненную строку для дальнейшей работы
        for (int j = i, h = 0; j >= Short.MIN_VALUE; j--){
            if (j % n != 0)   s += String.valueOf(j)+",";
        }                             /* проходим циклом в заданном диапазоне и добавляем в нее значения
                                         соответствующие условию */

        String [] m2 = s.split(",");/* создаем массив m2 в который помещаем значения строки s через разделитель
                                            "," при помощи метода .split() */
// данные не вывожу на экран потому, что слишком много получается
        }
    }
