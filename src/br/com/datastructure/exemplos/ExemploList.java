package br.com.datastructure.exemplos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {

        arrayList.add(2);
        arrayList.add(9);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.add(9);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isEmpty());

        linkedList.add(9);
        linkedList.add(6);
        System.out.println(linkedList);

    }

}
