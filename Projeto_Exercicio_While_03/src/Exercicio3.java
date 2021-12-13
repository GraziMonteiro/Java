import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        System.out.println("===== Ler Números Inteiros e Imprimir sua sequência =====");
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        while(num >=  num){
            System.out.println("A sêquencia é: " + num);
            num++;
        }
        entrada.close();
    }
}
