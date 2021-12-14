import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Declaração da matriz
        int[][] numeros = new int[4][4];
        int somaLinhas = 0, total = 0;

        // Armazenar os dados
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                numeros[i][j] = teclado.nextInt();
            }
        }

        // Precorrer os dados para calcular o somatório
        for (int i = 0; i < numeros.length; i++){
            somaLinhas = 0; // zera o acumulador de linhas toda vez que inicia uma nova linha
            for (int j = 0; j < numeros[i].length; j++){

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

