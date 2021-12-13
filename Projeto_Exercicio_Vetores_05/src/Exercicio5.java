import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[5];
        int i =0;
        int j =0;

        for(i=0; i<5; i++){
            System.out.println("Informe o valor para a posição  " + (i+1) + " do vetor 1 "  );
            v1[i] = entrada.nextInt();
        }
        for (i=0; i<5; i++){
            System.out.println("Informe o valor para a posição  " + (i+1) + " do vetor 2 "  );
            v2[i] = entrada.nextInt();
        }
        for(i=0; i<5; i++){
            v3[j] = v1[i] - v2[i];
        }

        System.out.println("Dados do Vetor 3: ");
        for(j=0; j<5; j++){
        System.out.println(v3[j]);
        }
        entrada.close();
    }
}
