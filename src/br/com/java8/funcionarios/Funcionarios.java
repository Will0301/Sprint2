package br.com.java8.funcionarios;


public class Funcionarios {

        private final String nome;
        private final int idade;
        private final Genero genero;

        public Funcionarios(String nome, int idade, Genero genero) {
            this.nome = nome;
            this.idade = idade;
            this.genero = genero;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public Genero getGenero() {
            return genero;
        }

        @Override
        public String toString() {
            return "Funcionário{" +
                    "nome='" + nome + '\'' +
                    ", Idade=" + idade +
                    ", Genero=" + genero +
                    '}';
        }
}
