package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class KekSet {
    public static void main(String[] args) {
        ImSet kek = new ImSet();
        System.out.println(kek.isEmpty());
        System.out.println(kek.add(9));
        Iterator<Integer> i = kek.outInt();
        while (i.hasNext()){
            int num = i.next();
        }


    }

}


class ImSet<E>{
     private HashMap<E,Object> arr = new HashMap<>();
     private final Object X = new Object();

    public  boolean add (E num) {
        return arr.put(num,X) == null;
    }
    public boolean del(E num){
        return arr.remove(num,X);
    }
    public int size(){
        return arr.size();
    }
    public boolean isEmpty(){
        return size()== 0;

    }
    public boolean contains(Objects num){
        return arr.containsKey(num);
    }
    public Iterator<E> outInt(){
        return arr.keySet().iterator();

    }
    public E outByIndex(int index){
        E [] arrMap = (E[]) arr.keySet().toArray();
        return arrMap[index];





    }
}