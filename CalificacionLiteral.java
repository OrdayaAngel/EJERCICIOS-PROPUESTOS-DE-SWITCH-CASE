import java.util.Scanner;

public class CalificacionLiteral {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una letra de calificacion: ");
        char letra = entrada.next().charAt(0);

        letra = Character.toUpperCase(letra);

        switch (letra) {
            case 'A':
                System.out.println("Excelente");
                break;

            case 'B':
                System.out.println("Bueno");
                break;

            case 'C':
                System.out.println("Regular");
                break;

            case 'D':
                System.out.println("Deficiente");
                break;

            case 'F':
                System.out.println("Reprobado");
                break;

            default:
                System.out.println("Calificacion invalida");
                break;
        }

        entrada.close();
    }
}