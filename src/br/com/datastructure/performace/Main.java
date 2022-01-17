package br.com.datastructure.performace;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

    static Stack<Integer> stack = new Stack<>();
    static List<Integer> list = new LinkedList<>();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        long tempoInicial;
        long tempoFinal;

        for(int i = 0; i < 1000000; i++){
            stack.add(i);
            list.add(i);
            queue.add(i);
        }


        tempoInicial = System.nanoTime();
        list.contains(820547);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de busca de um elemento de lista");

        tempoInicial = System.nanoTime();
        stack.contains(820547);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de busca de um elemento de pilha");

        tempoInicial = System.nanoTime();
        queue.contains(820547);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de busca de um elemento de fila");

        System.out.println();

        tempoInicial = System.nanoTime();
        list.add(0, 32);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adição de um elemento no inicio da lista");

        tempoInicial = System.nanoTime();
        stack.add(0, 32);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adição de um elemento no inicio da pilha");

        System.out.println();

        tempoInicial = System.nanoTime();
        list.add(1000001, 28);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adição de um elemento no fim da lista");

        tempoInicial = System.nanoTime();
        stack.add(1000001, 28);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adição de um elemento no fim da pilha");

        tempoInicial = System.nanoTime();
        queue.add(5);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adição de um elemento no fim da fila");

        System.out.println();

        tempoInicial = System.nanoTime();
        list.add(0, 32);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adição de um elemento no inicio da lista");

        tempoInicial = System.nanoTime();
        stack.add(0, 32);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de adição de um elemento no inicio da pilha");

        System.out.println();

        tempoInicial = System.nanoTime();
        list.remove(54726);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remoção de um elemento de lista");

        tempoInicial = System.nanoTime();
        stack.remove(54726);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remoção de um elemento de pilha");

        tempoInicial = System.nanoTime();
        queue.remove(54726);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remoção de um elemento de fila");

        System.out.println();

        tempoInicial = System.nanoTime();
        list.remove(54726);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remoção de todos os elementos de lista");

        tempoInicial = System.nanoTime();
        stack.remove(54726);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remoção de todos os elementos de pilha");

        tempoInicial = System.nanoTime();
        queue.remove(54726);
        tempoFinal = System.nanoTime();
        System.out.print(tempoFinal - tempoInicial);
        System.out.println(" Tempo de remoção de todos os elementos de fila");



    }
}
