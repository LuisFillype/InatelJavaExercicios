import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner valorEntrada = new Scanner(System.in);

        int numero;
        int aleatorio;

        Random valorRandom = new Random();

        aleatorio = valorRandom.nextInt(10)+1;
        System.out.println(aleatorio);

        do {
            System.out.println("Numero: ");
            numero = valorEntrada.nextInt();

        }while(numero!=aleatorio);

        System.out.println("Acertou ! ");



    }
}