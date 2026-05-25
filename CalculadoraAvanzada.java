import java.util.Scanner;

public class CalculadoraAvanzada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("===== CALCULADORA AVANZADA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.print("Elija una opcion: ");
        int opcion = entrada.nextInt();

        System.out.print("Ingrese el primer numero: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = entrada.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case 4:
                if (numero2 == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    System.out.println("Resultado: " + (numero1 / numero2));
                }
                break;

            case 5:
                System.out.println("Resultado: " + Math.pow(numero1, numero2));
                break;

            default:
                System.out.println("Entrada invalida");
                break;
        }

        entrada.close();
    }
}