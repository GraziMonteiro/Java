public class Exercicio3 {
    public static void main(String[] args) {
        int num[][] = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
        int num2[][] = {{0, 1, 4, 9, 16, 25, 36, 49, 64, 81}, {0, 1, 4, 9, 16, 25, 36, 49, 64, 81}, {0, 1, 4, 9, 16, 25, 36, 49, 64, 81}, {0, 1, 4, 9, 16, 25, 36, 49, 64, 81}, {0, 1, 4, 9, 16, 25, 36, 49, 64, 81}};
        int num3[][] = {{0, 0, 0, 0, 0, 0,}, {1, 1, 1, 1, 1, 1}, {2, 2, 2, 2, 2, 2},{3, 3, 3, 3, 3, 3},{4, 4, 4, 4, 4, 4},{5, 5, 5, 5, 5, 5}};
        int num4[][] = {{-1,-1,-1,-1,-1,-1}, {0,0,0,0,0,0},{-1,-1,-1,-1,-1,-1}, {0,0,0,0,0,0},{-1,-1,-1,-1,-1,-1}, {0,0,0,0,0,0},{-1,-1,-1,-1,-1,-1},{0,0,0,0,0,0},{-1,-1,-1,-1,-1,-1}};
        int i, j;

        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("=================================================");
        System.out.println("|              Elementos da Matriz              |");
        System.out.println("=================================================");


        for (i = 0; i < num2.length; i++) {
            for (j = 0; j < num2[i].length; j++) {
                System.out.print(num2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("=================================================");
        System.out.println("|              Elementos da Matriz              |");
        System.out.println("=================================================");


        for (i = 0; i < num3.length; i++) {
            for (j = 0; j < num3[i].length; j++) {
                System.out.print(num3[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("=================================================");
        System.out.println("|              Elementos da Matriz              |");
        System.out.println("=================================================");

        for (i = 0; i < num4.length; i++) {
            for (j = 0; j < num4[i].length; j++) {
                System.out.print(num4[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
