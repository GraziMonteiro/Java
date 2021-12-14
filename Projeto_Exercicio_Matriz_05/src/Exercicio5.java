import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Declaração da matriz
        int[][] numeros = {{00, 15, 30, 05, 12},{15, 00, 10, 17, 28},{30, 10, 00, 03, 11},{05, 17, 03, 00, 80},{12, 28, 11, 80, 00}};
        int somaLinhas = 0, total = 0;

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
                somaLinhas += numeros[i][j]; // acumula os somatório dos elemento de cada linha
            }
            System.out.println("A soma da linha [" + i + "] é: " + somaLinhas);
            total += somaLinhas; // acumula o somatório total dos elementos da matriz
            System.out.println("O somatório dos elementos da matriz é: " + total);
        }
        teclado.close();
    }
}

