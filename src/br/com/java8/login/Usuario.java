package br.com.java8.login;

import java.util.Optional;

public class Usuario implements VerificaSenha {

    private String senha;
    private String nome;
    private String email;

    public Usuario(String senha, String nome, String email) {
        this.senha = senha;
        this.nome = nome;
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean verificaSenha(String senha) {
        return senha.equals(this.senha);
    }
}
