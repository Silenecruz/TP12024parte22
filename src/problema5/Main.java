package problema5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[] numeros = new int[16];
        int index = 0;

        try {
            Scanner scanner = new Scanner(new File("numeros.txt"));

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num < 1 || num > 16) {
                    System.out.println("Os números no arquivo devem estar entre 1 e 16.");
                    return;
                }

                if (numeros[num - 1] == 1) {
                    System.out.println("O número " + num + " ocorre mais de uma vez no arquivo.");
                    return;
                }

                numeros[num - 1] = 1;
                matriz[index / 4][index % 4] = num;
                index++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            return;
        }

        // Verificar se todos os números de 1 a 16 ocorrem exatamente uma vez
        for (int num : numeros) {
            if (num != 1) {
                System.out.println("O número " + (Arrays.asList(numeros).indexOf(0) + 1) + " está faltando no arquivo.");
                return;
            }
        }

        // Verificar se a soma das linhas, colunas e diagonais é igual
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += matriz[0][i];
        }

        // Verificar linhas
        for (int i = 1; i < 4; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != soma) {
                System.out.println("Não é um quadrado mágico.");
                return;
            }
        }

        // Verificar colunas
        for (int i = 0; i < 4; i++) {
            int somaColuna = 0;
            for (int j = 0; j < 4; j++) {
                somaColuna += matriz[j][i];
            }
            if (somaColuna != soma) {
                System.out.println("Não é um quadrado mágico.");
                return;
            }
        }

        // Verificar diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 4; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != soma) {
            System.out.println("Não é um quadrado mágico.");
            return;
        }

        // Verificar diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 4; i++) {
            somaDiagonalSecundaria += matriz[i][3 - i];
        }
        if (somaDiagonalSecundaria != soma) {
            System.out.println("Não é um quadrado mágico.");
            return;
        }

        System.out.println("É um quadrado mágico!");
    }
}
