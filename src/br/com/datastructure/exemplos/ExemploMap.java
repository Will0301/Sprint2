package br.com.datastructure.exemplos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

    static Map<Integer, String> hashMap = new HashMap<>();
    static Map<Integer, String> treeMap = new TreeMap<>();
    static Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

    public static void main(String[] args) {

        hashMap.put(35004,"Alabama");
        hashMap.put(32003,"Florida");
        hashMap.put(48001,"Michigan");
        hashMap.put(14925,"New York");
        hashMap.put(29001,"South Carolina");
        System.out.println(hashMap);

        treeMap.put(35005,"Alabama");
        treeMap.put(32003,"Florida");
        treeMap.put(48001,"Michigan");
        treeMap.put(14925,"New York");
        treeMap.put(29001,"South Carolina");
        System.out.println(treeMap);

        linkedHashMap.put(35006,"Alabama");
        linkedHashMap.put(32003,"Florida");
        linkedHashMap.put(48001,"Michigan");
        linkedHashMap.put(14925,"New York");
        linkedHashMap.put(29001,"South Carolina");
        System.out.println(linkedHashMap);

        System.out.println(hashMap.get(3200));

    }


}
