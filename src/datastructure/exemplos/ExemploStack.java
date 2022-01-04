package datastructure.exemplos;

import java.util.Stack;

public class ExemploStack {

   static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {

        stack.add("Clean Code");
        stack.add("Java For Everyone");
        stack.add("14 tips for programmers");
        stack.add("Data Structure");
        stack.add("Clean Architecture");

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search("Clean Code"));

        stack.push("OOP Java");
        System.out.println(stack);

        stack.clear();
        System.out.println(stack);



    }

}
