
public class Exercicio4 {
    public static void main(String[] args) {
            int[] a = { 87, 68, 94, 100, 83};
            int[] b = new int[5];
            int menor = 0;

            for (int cont = 0; cont < a.length; cont ++){
                b[cont] = a[cont] * 3;
            }
            int tamanho = b.length;
            for (int i = 0; i < tamanho; i++) {
                if (b[i] < menor) {
                    menor = b[i];
                }
            }
            System.out.print("O menor numero é: " +menor);
    }
}


