package br.com.datastructure.performace;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerformaceSet {

    static Set<Integer> hashSet = new HashSet<>();
    static Set<Integer> treeSet = new TreeSet<>();
    static Set<Integer> linkedHashSet = new LinkedHashSet<>();

    public static void main(String[] args) {
        long tempoInicial;
        long tempoFinal;

        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
            treeSet.add(i);
            linkedHashSet.add(i);
        }

        tempoInicial = System.nanoTime();
        hashSet.add(50000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para adição de elemento em HashSet");

        tempoInicial = System.nanoTime();
        treeSet.add(50000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para adição de elemento em TreeSet");

        tempoInicial = System.nanoTime();
        linkedHashSet.add(50000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para adição de elemento em LinkedHashSet");

        System.out.println();

        tempoInicial = System.nanoTime();
        hashSet.remove(584521);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de elemento em HashSet");

        tempoInicial = System.nanoTime();
        treeSet.remove(584521);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de elemento em TreeSet");

        tempoInicial = System.nanoTime();
        linkedHashSet.remove(584521);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de elemento em LinkedHashSet");

        System.out.println();

        tempoInicial = System.nanoTime();
        hashSet.contains(521451);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para verificar se possuí um elemento em HashSet");

        tempoInicial = System.nanoTime();
        hashSet.contains(521451);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para verificar se possuí um elemento em TreeSet");

        tempoInicial = System.nanoTime();
        hashSet.contains(521451);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para verificar se possuí um elemento em LinkedHashSet");

        System.out.println();

        tempoInicial = System.nanoTime();
        hashSet.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de todos os elementos em HashSet");

        tempoInicial = System.nanoTime();
        treeSet.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de todos os elementos em TreeSet");

        tempoInicial = System.nanoTime();
        linkedHashSet.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de todos os elementos em LinkedHashSet");


    }
}
