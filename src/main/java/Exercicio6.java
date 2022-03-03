import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        
        Scanner valorEntrada = new Scanner(System.in);
        
        int numero;
        int aleatorio;
        
        Random valorRandom = new Random();
        
        aleatorio = valorRandom.nextInt(10)+1;

        do {
            System.out.println("Numero: ");
            numero = valorEntrada.nextInt();
            if (numero<aleatorio){
                System.out.println("Menor");

            }
            else{
                System.out.println("maior");
            }


        }while(numero!=aleatorio);

        System.out.println("Acertou ! ");


    }
}