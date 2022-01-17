package br.com.datastructure.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCode {

    static Set<Funcionarios> funcionarios = new HashSet<>();

    public static void main(String[] args) {

        funcionarios.add(new Funcionarios("João"));
        funcionarios.add(new Funcionarios("Carlos"));
        funcionarios.add(new Funcionarios("Willian"));
        funcionarios.add(new Funcionarios("Chaves"));
        funcionarios.add(new Funcionarios("Bia"));
        funcionarios.add(new Funcionarios("Julia"));
        funcionarios.add(new Funcionarios("Ruan"));
        funcionarios.add(new Funcionarios("Diego"));
        funcionarios.add(new Funcionarios("Roberta"));
        funcionarios.add(new Funcionarios("Jona"));
        funcionarios.add(new Funcionarios("Lewis"));
        funcionarios.add(new Funcionarios("Lando"));
        funcionarios.add(new Funcionarios("Vettel"));
        funcionarios.add(new Funcionarios("Gasly"));
        funcionarios.add(new Funcionarios("George"));
        funcionarios.add(new Funcionarios("Ster"));

        long t1 = System.nanoTime();
        System.out.println(funcionarios.contains(new Funcionarios("Willian")));
        long t2 = System.nanoTime();
        System.out.println(t2-t1);
    }
}
