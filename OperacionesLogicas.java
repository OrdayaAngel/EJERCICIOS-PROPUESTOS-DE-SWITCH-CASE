import java.util.Scanner;

public class OperacionesLogicas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean resultado = false;
        boolean operadorValido = true;

        System.out.print("Ingrese operador logico AND, OR o XOR: ");
        String operador = entrada.next().toUpperCase();

        System.out.print("Ingrese primer valor booleano true/false: ");
        boolean valor1 = entrada.nextBoolean();

        System.out.print("Ingrese segundo valor booleano true/false: ");
        boolean valor2 = entrada.nextBoolean();

        switch (operador) {
            case "AND":
                resultado = valor1 && valor2;
                break;

            case "OR":
                resultado = valor1 || valor2;
                break;

            case "XOR":
                resultado = valor1 ^ valor2;
                break;

            default:
                operadorValido = false;
                System.out.println("Operador invalido");
                break;
        }

        if (operadorValido) {
            System.out.println("Resultado: " + resultado);
        }

        entrada.close();
    }
}