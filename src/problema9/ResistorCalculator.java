package problema9;

import java.util.Random;

public class ResistorCalculator {
    public static void main(String[] args) {
        // Exemplo com resistências de 330 Ω ± 10%
        double nominalResistance = 330; // Resistência nominal em ohms
        double tolerance = 0.10; // Tolerância de ±10%

        System.out.println("Resistências de 330 Ω ± 10%:");
        for (int i = 1; i <= 10; i++) {
            double minResistance = nominalResistance * (1 - tolerance);
            double maxResistance = nominalResistance * (1 + tolerance);
            double realResistance = getRandomValue(minResistance, maxResistance);
            System.out.println("Resistência " + i + ": " + realResistance + " Ω");
        }
    }

    // Método para obter um valor aleatório dentro de um intervalo
    private static double getRandomValue(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }
}


