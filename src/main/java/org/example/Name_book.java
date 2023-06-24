package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Name_book {
    public static void main(String[] args) {
        ArrayList<Integer> key = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        int control = 0;
        String menu = """
                1.добавить пользователя
                2.показать пользователей
                3.показать отсортированный перечень пользователей и выйти
                5.выйти из программы 
                 
                """;
        Scanner scanner = new Scanner(System.in);
        while (control !=5){
            System.out.println(menu);
            System.out.print("Введите команду -> ");
            control= scanner.nextInt();

            if(control == 1) {
                addUser(names, gender, ages, scanner);
            }
            if(control==2){
               print(names, gender, ages);
             }
            if(control==3){
                sort(names, gender, ages);
                control = 5;
            }

        }
    }
    public static void addUser(ArrayList<String> names, ArrayList<String> genders ,
                               ArrayList<Integer>ages, Scanner sc) {

        System.out.println("Введите имя");
        String name = sc.next();
        System.out.println("Введите пол");
        String gender = sc.next();
        System.out.println("Введите возраст");
        int age = sc.nextInt();
        names.add(name);
        genders.add(gender);
        ages.add(age);

    }

    public static void print(ArrayList<String> names, ArrayList<String> genders ,
                             ArrayList<Integer>ages) {

        System.out.println("_________________________________________________");
        for (int i = 0; i< names.size(); i++ ) {
            System.out.println(names.get(i)+" "+ genders.get(i)+" "+ ages.get(i));

        }
        System.out.println("_________________________________________________");

    }

    public static void sort(ArrayList<String> names, ArrayList<String> genders ,
                             ArrayList<Integer>ages) {

        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<Integer> agess = new ArrayList<>(ages);
        agess.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i = 0; i< ages.size(); i++){
            keys.add(ages.indexOf(agess.get(i)));
        }
        for (int j : keys
             ) {
            System.out.println(names.get(j)+" "+ genders.get(j)+" "+ ages.get(j));
        }
    }

}
