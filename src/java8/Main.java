package java8;

public class Main {

    public static void main(String[] args) {

        Soma soma = (x, y) -> {
            double b = x + y;
            return b * 5;
        };

        System.out.println(soma.Soma(6, 3));
    }
}
