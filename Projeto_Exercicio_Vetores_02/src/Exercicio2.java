import java.util.Scanner;
    public class Exercicio2 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            String[] nome = new String[5];
            int tam = nome.length;
            int i;

            for(i = 0 ; i < tam ; i++ ){
                System.out.println("Digite sue nome: ");
                nome[i] = entrada.next();
            }
            for(i = 4; i < tam; i--){
                System.out.println("Os nomes são: " + nome[i]);
            }
            entrada.close();
        }
    }
