package problema7;

import java.awt.Point;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        Cannonball cannonball = new Cannonball(0); // Inicializa a bala de canhão na posição x = 0
        double alpha = 45; // Ângulo de lançamento em graus
        double v = 50; // Velocidade inicial em m/s
        double deltaSec = 0.1; // Intervalo de tempo em segundos

        // Dispara a bala de canhão e obtém as localizações ao longo do tempo
        ArrayList<Point> locations = cannonball.shoot(alpha, v, deltaSec);

        // Imprime as localizações ao longo do tempo
        for (Point location : locations) {
            System.out.println("x: " + location.x + ", y: " + location.y);
        }
    }
}


