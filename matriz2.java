
package junior;

import java.util.Random;

import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][3];
        Random num = new Random();
        Scanner tcl = new Scanner(System.in);
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C] = num.nextInt(81);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("Digite um valor a ser procurado");
        int valor = tcl.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (valor == matriz[i][j]) {
                    System.out.println("Valor encontrado");
                    break;
                } else {
                    System.out.println("Valor não encontrado");
                    break;
                }
            }

        }

    }
}
