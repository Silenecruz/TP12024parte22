package problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ponto> pontos = receberPontos();

        // Calculando e imprimindo a distância entre pontos consecutivos
        System.out.println("\nDistâncias entre pontos consecutivos:");
        for (int i = 0; i < pontos.size() - 1; i++) {
            Ponto ponto1 = pontos.get(i);
            Ponto ponto2 = pontos.get(i + 1);
            double distancia = distanciaDePontos(ponto1.getX(), ponto1.getY(), ponto2.getX(), ponto2.getY());
            System.out.println("Distância entre ponto " + (i + 1) + " e ponto " + (i + 2) + ": " + distancia);
        }
    }

    private static ArrayList<Ponto> receberPontos() {
        ArrayList<Ponto> pontos = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas cartesianas (x, y) dos pontos (digite 'fim' para parar):");
        while (true) {
            System.out.print("x: ");
            String inputX = scanner.nextLine();
            if (inputX.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("y: ");
            String inputY = scanner.nextLine();
            if (inputY.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                double x = Double.parseDouble(inputX);
                double y = Double.parseDouble(inputY);
                pontos.add(new Ponto(x, y));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira números.");
            }
        }
        return pontos;
    }

    private static double distanciaDePontos(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

