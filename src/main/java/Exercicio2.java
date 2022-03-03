import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner valorEntrada = new Scanner(System.in);

        int[] partidas = new int [3];
        int totalZumbis = 0;
        int media;

        for (int i=1; i<= partidas.length; i++)
        {
            System.out.println("Entre com a "+ i + "° partida");
            partidas[i-1]= valorEntrada.nextInt();
            totalZumbis+= partidas[i-1];
        }


        media = totalZumbis/partidas.length;

        System.out.println("Total de zumbis mortos: " + totalZumbis);
        System.out.println("Media: " + media);
    }


}