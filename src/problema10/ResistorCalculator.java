package problema10;

import java.util.Scanner;

public class ResistorCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a sequência de cores para as faixas do resistor (separadas por vírgula):");
        String input = scanner.nextLine().toLowerCase().trim();

        String[] faixas = input.split(",");
        if (faixas.length != 4) {
            System.out.println("Por favor, insira exatamente quatro cores.");
            return;
        }

        double resistencia = calcularResistencia(faixas);
        if (resistencia != -1) {
            System.out.println("Valor da resistência: " + resistencia + " Ω");
        }
    }

    public static double calcularResistencia(String[] faixas) {
        int primeiroDigito = getValor(faixas[0]);
        int segundoDigito = getValor(faixas[1]);
        int multiplicador = getMultiplicador(faixas[2]);
        double tolerancia = getTolerancia(faixas[3]);

        if (primeiroDigito == -1 || segundoDigito == -1 || multiplicador == -1 || tolerancia == -1) {
            System.out.println("Por favor, insira cores válidas.");
            return -1;
        }

        return (primeiroDigito * 10 + segundoDigito) * multiplicador;
    }

    private static int getValor(String cor) {
        if ("preto".equals(cor)) {
            return 0;
        } else if ("brown".equals(cor)) {
            return 1;
        } else if ("red".equals(cor)) {
            return 2;
        } else if ("orange".equals(cor)) {
            return 3;
        } else if ("yellow".equals(cor)) {
            return 4;
        } else if ("green".equals(cor)) {
            return 5;
        } else if ("blue".equals(cor)) {
            return 6;
        } else if ("violet".equals(cor)) {
            return 7;
        } else if ("grey".equals(cor)) {
            return 8;
        } else if ("white".equals(cor)) {
            return 9;
        }
        return -1;
    }

    private static int getMultiplicador(String cor) {
        if ("preto".equals(cor)) {
            return 1;
        } else if ("brown".equals(cor)) {
            return 10;
        } else if ("red".equals(cor)) {
            return 100;
        } else if ("orange".equals(cor)) {
            return 1000;
        } else if ("yellow".equals(cor)) {
            return 10000;
        } else if ("green".equals(cor)) {
            return 100000;
        } else if ("blue".equals(cor)) {
            return 1000000;
        } else if ("violet".equals(cor)) {
            return 0;
        } else if ("grey".equals(cor)) {
            return 0;
        } else if ("white".equals(cor)) {
            return 0;
        }
        return -1;
    }

    private static double getTolerancia(String cor) {
        if ("gold".equals(cor)) {
            return 5;
        } else if ("silver".equals(cor)) {
            return 10;
        }
        return -1;
    }
}

