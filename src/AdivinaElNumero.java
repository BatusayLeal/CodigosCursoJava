import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[10];
        boolean[] usado = new boolean[11];
        int cantidad = 0;

        while (cantidad < 10) {
            int numAleatorio = random.nextInt(10) + 1;
            if (!usado[numAleatorio]) {
                numeros[cantidad] = numAleatorio;
                usado[numAleatorio] = true;
                cantidad++;
            }
        }

        int indiceSecreto = random.nextInt(10);
        int numeroSecreto = numeros[indiceSecreto];

        System.out.println("=============================================");
        System.out.println(" ADIVINANZAAAAAA ");
        System.out.println("=============================================");
        System.out.println("He elegido un número secreto del 1 al 10.");
        System.out.println("¡Tienes SOLO 3 oportunidades para adivinarlo!");
        System.out.println("Si fallas las 3... ¡Te vay cortao! ");
        System.out.println("=============================================\n");

        boolean ganado = false;

        for (int intento = 1; intento <= 3; intento++) {
            System.out.print("Intento " + intento + " de 3 → Ingresa un número (1-10): ");
            int guess = scanner.nextInt();

            if (guess == numeroSecreto) {
                System.out.println("\n Adivinaste el número: " + numeroSecreto);
                System.out.println(" Wena ziii oeeeee !!! ");
                ganado = true;
                break;
            } else {
                if (guess < numeroSecreto) {
                    System.out.println("   → El número secreto es MAYOR que " + guess);
                } else {
                    System.out.println("   → El número secreto es MENOR que " + guess);
                }

                int diferencia = Math.abs(guess - numeroSecreto);
                if (diferencia <= 2) {
                    System.out.println("   → ¡Estás CERCA!");
                } else {
                    System.out.println("   → ¡Estás LEJOS!");
                }
            }
        }

        if (!ganado) {
            System.out.println("\n ¡Se acabaron tus 3 oportunidades! ");
            System.out.println("¡Te moriste Longi!");
            System.out.println("El número secreto era: " + numeroSecreto);
        }
        scanner.close();
    }
}