import java.util.Scanner;
public class Exercicio6 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int num,i=1;
        do {
            System.out.println("Digite um número: ");
            num = entrada.nextInt();
            i++;

            if(num < num)
                System.out.print("O menor è: " + num);
        }while(i <=10);
        entrada.close();
    }
}
