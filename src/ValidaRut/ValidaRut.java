package ValidaRut;
import java.util.Scanner;
import ValidaRut.ValidaRut;

public class ValidaRut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un RUT (ej: 12.345.678-5): ");
        String rut = scanner.nextLine().trim().toUpperCase();

        if (!rut.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-[0-9K]")) {
            System.out.println("Formato inválido.");
            scanner.close();
        }

        String[] partes = rut.split("-");

        String numero = partes[0].replace(".", "");
        char dvIngresado = partes[1].charAt(0);

        char dvCalculado = calcularDV(Integer.parseInt(numero));

        if (dvIngresado == dvCalculado) {
            System.out.println("RUT válido.");
        } else {
            System.out.println("RUT inválido.");
            System.out.println("Dígito esperado: " + dvCalculado);
        }

        scanner.close();
    }

    public static char calcularDV(int rut) {

        int suma = 0;
        int multiplicador = 2;

        while (rut > 0) {

            suma += (rut % 10) * multiplicador;

            rut /= 10;

            multiplicador++;

            if (multiplicador > 7)
                multiplicador = 2;
        }

        int resultado = 11 - (suma % 11);

        if (resultado == 11)
            return '0';

        if (resultado == 10)
            return 'K';

        return (char) ('0' + resultado);
    }
}
