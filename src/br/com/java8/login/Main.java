package br.com.java8.login;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Usuario willian = new Usuario("Ysjai85", "Willian", "WILLIAN@gmail.com");
        Usuario jorge = new Usuario("Ksue85", "Jorge", null);

        String email1 = willian.getEmail()
                .map(String::toLowerCase)
                .orElse("Campo de Email incompleto.");

        System.out.println(email1);
        System.out.println(willian.verificaSenha("Ysjai85"));

        String email2 = jorge.getEmail()
                .map(String::toLowerCase)
                .orElse("Campo de Email incompleto.");

        System.out.println(email2);

    }
}
