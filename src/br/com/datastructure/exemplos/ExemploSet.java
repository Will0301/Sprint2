package br.com.datastructure.exemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    static Set<Integer> hashSet = new HashSet<>();
    static Set<Integer> treeSet = new TreeSet<>();
    static Set<Integer> linkedHashSet = new LinkedHashSet<>();

    public static void main(String[] args) {
        hashSet.add(8);
        hashSet.add(2);
        hashSet.add(15);

        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(15);

        linkedHashSet.add(8);
        linkedHashSet.add(2);
        linkedHashSet.add(15);

        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);

    }

}
