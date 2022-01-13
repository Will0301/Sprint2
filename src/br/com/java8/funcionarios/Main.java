package br.com.java8.funcionarios;

import java.util.Comparator;
import java.util.List;
public class Main {


    private static List<Funcionarios> getFuncionarios() {
        return List.of(
                new Funcionarios("Antonio", 20, Genero.MASCULINO),
                new Funcionarios("Alissa", 33, Genero.FEMININO),
                new Funcionarios("Helen", 57, Genero.FEMININO),
                new Funcionarios("Alex", 14, Genero.MASCULINO),
                new Funcionarios("Jamie", 99, Genero.MASCULINO),
                new Funcionarios("Anna", 7, Genero.FEMININO),
                new Funcionarios("Zelda", 120, Genero.FEMININO)
        );
    }

    public static void main(String[] args) {

        List<Funcionarios> funcionarios = getFuncionarios();

        getFuncionarios().forEach(System.out::println);
        System.out.println();

        List<Funcionarios> mulheres = funcionarios.stream()
                .filter(f -> f.getGenero().equals(Genero.FEMININO)).toList();
        mulheres.forEach(System.out::println);
        System.out.println();



        List<Funcionarios> ordenarIdade = funcionarios.stream()
                .sorted(Comparator.comparing(Funcionarios::getIdade)).toList();
        ordenarIdade.forEach(System.out::println);



       boolean todosPossuem = funcionarios.stream()
                .allMatch(f -> f.getIdade() > 5);
        System.out.println("\n" + todosPossuem);



    }


}
