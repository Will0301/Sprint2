package br.com.datastructure.equalshashcode;

import java.util.Objects;

public class Funcionarios {

    String nome;

    Funcionarios(String nome){
        this.nome = nome;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionarios that = (Funcionarios) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
}
