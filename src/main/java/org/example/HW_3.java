package org.example;
import java.awt.image.AffineTransformOp;
import java.util.*;
import java.util.Collections;
public class HW_3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
        }
        print_array(list,"Новый список -> ");
        list = notEvenValue(list);
        print_array(list,"список без четных чисел -> ");
        max_min(list);
        average(list);
    }
    public static ArrayList<Integer> notEvenValue(ArrayList<Integer>list){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int x:list) {
            if(x % 2 != 0 ){
                temp.add(x);
            }

        }
        return temp;

    }

    public static void print_array(ArrayList<Integer> list, String msg) {
        System.out.print(msg);
        for (int x:list) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static void max_min (ArrayList<Integer>list){
        list.sort(new Comparator<Integer>() {
                      @Override
                      public int compare(Integer o1, Integer o2) {
                          return o1-o2;
                      }
                  });

        System.out.println("минимальное число в списке -> "+ list.get(0));
        System.out.println("максимальное число в списке -> " + list.get(list.size()-1));




    }
    public static void average (ArrayList<Integer>list){
        int sum = 0;
        for (int x:list
             ) {
            sum += x;
        }
        System.out.println("среднее значение списка-> "+sum/ list.size()+"."+sum% list.size());


    }
}
