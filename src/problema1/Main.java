package problema1;
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Robot na posição (0, 0) voltado para o Norte
        Robot robot = new Robot(0, 0, Direcao.NORTE);

        // Movendo o robô e virando à esquerda para testar os métodos
        robot.move();
        robot.turnLeft();
        robot.move();

        // Obtendo a localização e direção do robô e imprimindo na tela
        Ponto2D localizacao = robot.getLocation();
        String direcao = robot.getDirection();
        System.out.println("Localização do robô: (" + localizacao.x + ", " + localizacao.y + ")");
        System.out.println("Direção do robô: " + direcao);
    }
}
