import java.io.StringReader;
import java.util.Scanner;
    public class Exercicio1 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int i,maior, menor;
            double media, total;
            int[] numeros = new int[10];
            int tam = numeros.length;

            //Preencher Vetor
            for(i = 0; i < tam; i++ ){
                System.out.println("Digite um numero");;
                numeros[i] = entrada.nextInt();
            }
            maior = numeros[0];
            menor = numeros[0];

            for(i = 0; i < tam; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
            System.out.println("O maior número è: " + maior);
            System.out.println("O menor número è: " + menor);
            entrada.close();
        }
    }
