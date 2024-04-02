package problema1;

// Definição do enum para as direções
enum Direcao {
    NORTE, LESTE, SUL, OESTE
}

// Definição da classe Ponto2D para representar as coordenadas do robô
class Ponto2D {
    int x, y;

    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Definição da classe Robot
public class Robot {
    private Ponto2D location; // Coordenadas do robô
    private Direcao direction; // Direção do robô

    public Robot(int x, int y, Direcao direction) {
        this.location = new Ponto2D(x, y);
        this.direction = direction;
    }

    // Método para virar à esquerda
    public void turnLeft() {
        switch (direction) {
            case NORTE:
                direction = Direcao.OESTE;
                break;
            case LESTE:
                direction = Direcao.NORTE;
                break;
            case SUL:
                direction = Direcao.LESTE;
                break;
            case OESTE:
                direction = Direcao.SUL;
                break;
        }
    }

    // Método para virar à direita
    public void turnRight() {
        switch (direction) {
            case NORTE:
                direction = Direcao.LESTE;
                break;
            case LESTE:
                direction = Direcao.SUL;
                break;
            case SUL:
                direction = Direcao.OESTE;
                break;
            case OESTE:
                direction = Direcao.NORTE;
                break;
        }
    }

    // Método para mover o robô
    public void move() {
        switch (direction) {
            case NORTE:
                location.y++;
                break;
            case LESTE:
                location.x++;
                break;
            case SUL:
                location.y--;
                break;
            case OESTE:
                location.x--;
                break;
        }
    }

    // Método para obter as coordenadas do robô
    public Ponto2D getLocation() {
        return location;
    }

    // Método para obter a direção do robô
    public String getDirection() {
        return direction.toString();
    }

    // Método main para testar a classe Robot
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direcao.NORTE); // Cria um robô na posição (0,0) voltado para o Norte
        robot.move(); // Move o robô uma unidade para o Norte
        robot.turnRight(); // Vira o robô para o Leste
        robot.move(); // Move o robô uma unidade para o Leste
        System.out.println("Localização do robô: (" + robot.getLocation().x + ", " + robot.getLocation().y + ")");
        System.out.println("Direção do robô: " + robot.getDirection());
    }
}
