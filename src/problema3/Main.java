package problema3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto a ser encriptado:");
        String textoOriginal = scanner.nextLine();

        String textoEncriptado = rodarTexto(textoOriginal);

        System.out.println("Texto encriptado: " + textoEncriptado);
    }

    public static String rodarTexto(String texto) {
        StringBuilder textoEncriptado = new StringBuilder();

        for (char caractere : texto.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                textoEncriptado.append((char) ((caractere - base + 13) % 26 + base));
            } else {
                textoEncriptado.append(caractere);
            }
        }

        return textoEncriptado.toString();
    }
}

