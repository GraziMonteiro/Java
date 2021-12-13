import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("===== Imprima os números pares e impar =====");
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        while (num >= 10){
            if(num % 2 == 0){
               System.out.println("Esse número é par " + num );
            }
            else{
                System.out.println("Esse número é ímpar " + num );
            }
        }

    }
}
