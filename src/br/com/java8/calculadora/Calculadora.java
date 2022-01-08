package br.com.java8.calculadora;

public class Calculadora<T extends Number> {

    private T numero;

    Calculadora(T object){
        this.numero = object;
    }

    public Double soma(Calculadora<?> num){
        return Math.abs(numero.doubleValue()) + Math.abs(num.numero.doubleValue());
    }

    public Double subtrai(Calculadora<?> num){
        return Math.abs(numero.doubleValue()) - Math.abs(num.numero.doubleValue());
    }

    public Double divide(Calculadora<?> num){
        return Math.abs(numero.doubleValue()) / Math.abs(num.numero.doubleValue());
    }

    public Double multiplica(Calculadora<?> num){
        return Math.abs(numero.doubleValue()) * Math.abs(num.numero.doubleValue());
    }

    public Double square(Calculadora<?> num){
        return Math.abs(numero.doubleValue()) * Math.abs(numero.doubleValue());
    }

    public Double root(Calculadora<?> num){
        return Math.abs(numero.doubleValue()) / Math.abs(numero.doubleValue());
    }
}
