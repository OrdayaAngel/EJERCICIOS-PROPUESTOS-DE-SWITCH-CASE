import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("===== CONVERSOR DE UNIDADES =====");
        System.out.println("1. Metros a kilometros");
        System.out.println("2. Kilometros a metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");
        System.out.print("Elija una opcion: ");
        int opcion = entrada.nextInt();

        System.out.print("Ingrese el valor: ");
        double valor = entrada.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println(valor + " metros = " + (valor / 1000) + " kilometros");
                break;

            case 2:
                System.out.println(valor + " kilometros = " + (valor * 1000) + " metros");
                break;

            case 3:
                System.out.println(valor + " Celsius = " + ((valor * 9 / 5) + 32) + " Fahrenheit");
                break;

            case 4:
                System.out.println(valor + " Fahrenheit = " + ((valor - 32) * 5 / 9) + " Celsius");
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }

        entrada.close();
    }
}