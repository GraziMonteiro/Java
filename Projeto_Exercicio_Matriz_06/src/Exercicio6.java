import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaração da matriz
        char jogo[3][3];


        // Armazenar os dados
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println("Digite um número de 1 a 9 [" + i + "][" + j + "]: ");
                numeros[i][j] = teclado.nextInt();
            }
        }
        // Precorrer a matrix para imprimir os dados
        System.out.println("=================================================");
        System.out.println("|              Elementos da Matriz              |");
        System.out.println("=================================================");
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("");
        }

        teclado.close();
    }
}