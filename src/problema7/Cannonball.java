package problema7;
import java.awt.Point;
import java.util.ArrayList;

class Cannonball {
    private double x;
    private double y;
    private double vx;
    private double vy;

    public Cannonball(double x) {
        this.x = x;
        this.y = 0;
        this.vx = 0;
        this.vy = 0;
    }

    public void move(double deltaSec) {
        double g = -9.81; // Aceleração gravitacional em m/s^2

        // Calcula a nova posição usando as velocidades atuais
        double newX = x + vx * deltaSec;
        double newY = y + vy * deltaSec + 0.5 * g * deltaSec * deltaSec;

        // Atualiza as posições x e y
        x = newX;
        y = newY;

        // Atualiza a velocidade vy considerando a aceleração gravitacional
        vy += g * deltaSec;
    }

    public Point getLocation() {
        // Retorna a localização arredondada para coordenadas inteiras
        return new Point((int) Math.round(x), (int) Math.round(y));
    }

    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
        ArrayList<Point> locations = new ArrayList();

        // Calcula as velocidades inicial vx e vy
        vx = v * Math.cos(Math.toRadians(alpha));
        vy = v * Math.sin(Math.toRadians(alpha));

        // Move a bola de canhão até que a posição y seja 0
        while (y >= 0) {
            move(deltaSec);
            locations.add(getLocation());
        }

        return locations;
    }


}


