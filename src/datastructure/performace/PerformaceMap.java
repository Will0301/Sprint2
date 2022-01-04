package datastructure.performace;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PerformaceMap {

    static Map<Integer, Integer> hashMap = new HashMap<>();
    static Map<Integer, Integer> treeMap = new TreeMap<>();
    static Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        long tempoInicial;
        long tempoFinal;

        for (int i = 0; i < 1000000; i++) {
            hashMap.put(i, i*2);
            treeMap.put(i, i*2);
            linkedHashMap.put(i, i*2);
        }

        tempoInicial = System.nanoTime();
        hashMap.put(2, 968);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para adição de elemento em HashMap");

        tempoInicial = System.nanoTime();
        treeMap.put(2, 968);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para adição de elemento em treeMap");

        tempoInicial = System.nanoTime();
        linkedHashMap.put(2, 968);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para adição de elemento em LinkedHashMap");

        System.out.println();

        tempoInicial = System.nanoTime();
        hashMap.remove(800000, 800000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de elemento em HashMap");

        tempoInicial = System.nanoTime();
        treeMap.remove(800000, 800000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de elemento em TreeMap");

        tempoInicial = System.nanoTime();
        linkedHashMap.remove(800000, 800000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de elemento em LinkedHashMap");

        System.out.println();

        tempoInicial = System.nanoTime();
        hashMap.get(200000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para buscar elemento em HashMap");

        tempoInicial = System.nanoTime();
        treeMap.get(200000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para buscar elemento em TreeMap");

        tempoInicial = System.nanoTime();
        linkedHashMap.get(200000);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para buscar elemento em LinkedHashMap");


        System.out.println();

        tempoInicial = System.nanoTime();
        hashMap.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de todos os elementos em HashMap");

        tempoInicial = System.nanoTime();
        treeMap.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de todos os elementos em TreeMap");

        tempoInicial = System.nanoTime();
        linkedHashMap.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para remoção de todos os elementos em LinkedHashMap");

    }
}
