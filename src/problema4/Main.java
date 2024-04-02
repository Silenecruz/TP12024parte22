package problema4;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Inicializando o array com dez inteiros aleatórios
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Gerando números aleatórios entre 0 e 99
        }

        // Imprimindo todo elemento que está em um índice par
        System.out.println("Elementos nos índices pares:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

        // Imprimindo todo elemento par
        System.out.println("\nElementos pares:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // Imprimindo todos os elementos na ordem inversa
        System.out.println("\nElementos na ordem inversa:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // Imprimindo apenas o primeiro e último elemento
        System.out.println("\nPrimeiro e último elemento:");
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
    }
}
