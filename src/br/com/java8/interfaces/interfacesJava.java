package br.com.java8.interfaces;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class interfacesJava {

    static LocalDateTime hoje;

    public static void main(String[] args) {
        hoje = LocalDateTime.now();
        Pessoa p1 = new Pessoa("Willian", 19);
        Pessoa p2 = new Pessoa("Ana", 8);
        Pessoa p3 = new Pessoa("Carlos", 47);
        Pessoa p4 = new Pessoa("Bia", 23);

        //Predicate -> Boolean value
        Predicate<Integer> tresDigitos = num -> num >= 100;
        System.out.println(tresDigitos.test(258) + " - Predicate");
        System.out.println();

        //Consumer -> Return nothing
        Consumer<String> boasVindas =
                name -> System.out.println("Seja bem vindo(a) " + name + " " + hoje);

        List<String> nomes = Arrays.asList(p1.getName(),p2.getName(),p3.getName(),p4.getName());
        nomes.forEach(boasVindas);
        System.out.println();

        //Function -> Define parametro e retorno
        Function<Integer, Boolean> maior18 =
                num -> num >= 18;


        Function<Boolean, String>  autoriza =
                v -> v ? "Entrata autorizada" : "Entrada negada";

        System.out.println(maior18.andThen(autoriza).apply(p2.getIdade()));
        System.out.println();

        //Supplier -> Não recebe param apenas Devolve
        Supplier<List<Double>> sequencia =
                () -> Arrays.asList(2.5, 5.8, 9.0, 7.3);

        System.out.println(sequencia.get());
        System.out.println();

        //BiFunction -> Dois parametros e um retorno
        BiFunction<Double, Double, String> maiorNumero=
                (n1, n2) -> n1 > n2 ? n1 + " é maior que " + n2 : n2 + "é maior que " + n1;

        System.out.println(maiorNumero.apply(8.0, 80.0));


    }
}
