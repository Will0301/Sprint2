package br.com.java8.calculadora;

import org.jetbrains.annotations.NotNull;

public class Calculadora<T extends Number> {

    private T numero;

    Calculadora(T object){
        this.numero = object;
    }

    public Double soma(@NotNull Calculadora<?> num){
        return Math.abs(numero.doubleValue()) + Math.abs(num.numero.doubleValue());
    }

    public Double subtrai(@NotNull Calculadora<? extends Number> num){
        return Math.abs(numero.doubleValue()) - Math.abs(num.numero.doubleValue());
    }

    public Double divide(@NotNull Calculadora<?> num){
        return Math.abs(numero.doubleValue()) / Math.abs(num.numero.doubleValue());
    }

    public Double multiplica(@NotNull Calculadora<?> num){
        return Math.abs(numero.doubleValue()) * Math.abs(num.numero.doubleValue());
    }

    public Double square(Calculadora<? extends Number> num){
        return Math.abs(numero.doubleValue()) * Math.abs(numero.doubleValue());
    }

    public Double root(Calculadora<?> num){
        return Math.abs(numero.doubleValue()) / Math.abs(numero.doubleValue());
    }
}
