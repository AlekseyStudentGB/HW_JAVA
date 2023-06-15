package org.example;

import java.util.Arrays;

public class HW_2 {
    public static void main(String[] args) {

        String json = "{name:Ivanov, country:Russia, city:Moscow, age:null}";
        String [] where = json.substring(1,json.length()-1).split(", ");
        String [] table ={"students"};
        String str2 = "null";
        //select * from students where name=Ivanov, country=Russia, city=Moscow
        String str = "select * from"+ " "+ table[0]+ "  where ";
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        for (int i = 0; i < where.length; i++){
            if (where[i].substring(where[i].indexOf(":")+1).equals(str2)) {
            } else {
                builder.append(where[i].replace(":", "=") + ", ");
            }

        }
        System.out.println(builder.substring(0, builder.length()-2));
    }
}
