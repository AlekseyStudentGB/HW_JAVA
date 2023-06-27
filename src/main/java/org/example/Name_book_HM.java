package org.example;

import java.util.*;

public class Name_book_HM {

////////////////////////////////////////////
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> members = new HashMap<>();
        int control = 0;
        String menu = """
                1.добавить пользователя
                2.показать пользователей
                3.показать отсортированный перечень пользователей и выйти
                5.выйти из программы 
                 
                """;
        Scanner scanner = new Scanner(System.in);
        while (control != 4){
            System.out.println(menu);
            control = scanner.nextInt();

            if (control==1) {
                add(members,scanner);
            }
            if (control==2) {
                print(members);
            }

        }

    }
////////////////////////////////////////////
public static void add(HashMap<String,ArrayList<String>> map, Scanner sc){
    System.out.println("Введите имя");
    String name = sc.next();
    System.out.println("Введите номер");
    String number = sc.next();
    map.putIfAbsent(name,new ArrayList<>());
    map.get(name).add(number);

}

public static void print(HashMap<String,ArrayList<String>> map) {
    String [] arrKey = map.keySet().toArray(new String[0]);
    Arrays.stream(arrKey).sorted(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return map.get(o1).size()-map.get(o2).size();
        }
    });
    for (String item: arrKey
         ) {
        System.out.println(item+":");
        for (String values:map.get(item)
             ) {
            System.out.println(values);
        }
    }
    }
}



