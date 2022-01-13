package br.com.datastructure.exemplos;

import java.util.*;

public class ExemploQueue {

    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {

        queue.add("Willian");
        queue.add("Carlos");
        queue.add("Roberto");
        queue.add("Maria");
        queue.add("Ana");
        queue.add("João");
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.offer("Joana");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.contains("Ana"));
        queue.remove("Maria");
        System.out.println(queue.size());


    }

}
