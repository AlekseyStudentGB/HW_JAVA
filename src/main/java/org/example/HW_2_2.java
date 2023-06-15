package org.example;

import java.util.Arrays;

public class HW_2_2 {
    /* Дана json-строка (можно сохранить в файл и читать из файла)
 [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
     Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
     Пример вывода:*/
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String name = "Петрова"; // задаем имя ученика по которому хотим получить информацию
        System.out.println(strBuilder(json,name)); // выводим на экран инфу используя написанный метод

    }

    public static StringBuilder strBuilder (String str, String name ) { //создаем и описываем метод
        StringBuilder build = new StringBuilder(str); // перегоняем получаемую методом строку в билдер
        int index = build.indexOf(name, 0);  // определяем индекс вхождения заданного имени студента в билдере
        build = build.replace(0,index, "Студент "); // срезаем все данные в билдере до нужного имени и меняем согласно требуемого формата
        index = build.indexOf("\"", 0); // т.к. формат записи однообразный, а данные учеников последовательны то индекс первого символа " принимаем как начальную границу след этапа форматирования
        int index2 = build.indexOf(":", 0);// также определяем конечную границу форматирования по символу :+1
        build = build.replace(index, index2+2, " получил ");// форматируем часть строки границы которой мы определили
        index = build.indexOf("\"", 0);// ну и тд
        index2 = build.indexOf(":", 0);
        build = build.replace(index, index2 + 2, " по предмету ");
        index = build.indexOf("\"", 0);
        build = build.replace(index, build.length(), ".");
        return build; // возвращаем текст в отформатированном виде
    }

}




