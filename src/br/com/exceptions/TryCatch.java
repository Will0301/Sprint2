package br.com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {

    public static void numeroDeLetras(String palavra){
        System.out.println(palavra.length());
    }

    public static void lerArquivo(String arquivo) throws FileNotFoundException {
        FileReader leitor = new FileReader(arquivo);
    }

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5};
        try {
            System.out.println(vetor[8]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("O vetor só possui 5 posições");
        }

        int numero = 0;
        try {
            System.out.println(0 / 0);
        } catch (ArithmeticException e){
            System.out.println("Operação indeterminada");
        }

        String palavra = null;
        numeroDeLetras(palavra);

        //lerArquivo("Arquivo.txt");
    }
}
