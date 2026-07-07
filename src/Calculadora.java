import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" CALCULADORA SIMPLE ");
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            
            opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Salir de la calculadora");
                break;
            }
            // llama a la funcion validaNumero en
            double num1 = validaNumero(scanner, "Ingrese el primer número: ");
            double num2 = validaNumero(scanner, "Ingrese el segundo número: ");

            double resultado = 0;
            String parImpar = "";

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " × " + num2 + " = " + resultado);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        resultado = num1 / num2;

                        // Lógica de par/impar (mejorada un poco)
                        if (resultado == (long) resultado) { // Verifica si es número entero
                            if (((long) resultado) % 2 == 0) {
                                parImpar = " (El resultado es par)";
                            } else {
                                parImpar = " (El resultado es impar)";
                            }
                        } else {
                            parImpar = " (El resultado no es entero)";
                        }
                        
                        System.out.println("Resultado: " + num1 + " ÷ " + num2 + " = " + resultado + parImpar);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
 
    // Funcion de validacion de ingreso de numero booleano
    public static double validaNumero(Scanner scanner, String mensaje) {
        double numero;
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Error. Debe ingresar un número válido.");
            scanner.next();
            System.out.print(mensaje);
        }
        numero = scanner.nextDouble();
        return numero;
    }
}