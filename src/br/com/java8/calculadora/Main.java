package br.com.java8.calculadora;

public class Main {

    public static void main(String[] args) {

        Calculadora<Integer> num1 = new Calculadora<>(5);
        Calculadora<Double> num2 = new Calculadora<>(8.0);

        System.out.print(num1.multiplica(num2) +"\n"+ num2.divide(num1));
    }
}
