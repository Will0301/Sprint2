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

        long t1 = System.nanoTime();
        System.out.println(funcionarios.contains(new Funcionarios("Willian")));
        long t2 = System.nanoTime();
        System.out.println(t2-t1);
    }
}
