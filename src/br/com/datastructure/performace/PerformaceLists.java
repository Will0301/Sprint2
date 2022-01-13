package br.com.datastructure.performace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformaceLists {

    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        long tempoInicial;
         long tempoFinal;

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        tempoInicial = System.nanoTime();
        arrayList.add(650010, 587412);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adicionar um elemento no meio de um ArrayList");

        tempoInicial = System.nanoTime();
        linkedList.add(650010, 587412);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adicionar um elemento no meio de uma LinkedList");

        System.out.println();

        tempoInicial = System.nanoTime();
        arrayList.remove(587412);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remover um elemento no meio de um ArrayList");

        tempoInicial = System.nanoTime();
        linkedList.remove(587412);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remover um elemento no meio de uma LinkedList");

        System.out.println();

        tempoInicial = System.nanoTime();
        arrayList.remove(0);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remover um elemento no inicio de um ArrayList");

        tempoInicial = System.nanoTime();
        linkedList.remove(0);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remover um elemento no inicio de uma LinkedList");

        System.out.println();

        tempoInicial = System.nanoTime();
        arrayList.remove(999997);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remover um elemento no fim de um ArrayList");

        tempoInicial = System.nanoTime();
        linkedList.remove(999997);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remover um elemento no fim de uma LinkedList");

        System.out.println();

        tempoInicial = System.nanoTime();
        arrayList.get(784520);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para executar o get de um elemento no meio de um ArrayList");

        tempoInicial = System.nanoTime();
        linkedList.get(784520);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para executar o get de um elemento no meio de uma LinkedList");

        System.out.println();

        tempoInicial = System.nanoTime();
        arrayList.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para executar o clear de um ArrayList");

        tempoInicial = System.nanoTime();
        linkedList.clear();
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo para executar o clear de uma LinkedList");



    }
}
