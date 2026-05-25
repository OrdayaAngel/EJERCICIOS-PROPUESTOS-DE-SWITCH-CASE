import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 7: ");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                System.out.println("Dia laborable");
                break;

            case 2:
                System.out.println("Martes");
                System.out.println("Dia laborable");
                break;

            case 3:
                System.out.println("Miercoles");
                System.out.println("Dia laborable");
                break;

            case 4:
                System.out.println("Jueves");
                System.out.println("Dia laborable");
                break;

            case 5:
                System.out.println("Viernes");
                System.out.println("Dia laborable");
                break;

            case 6:
                System.out.println("Sabado");
                System.out.println("Fin de semana");
                break;

            case 7:
                System.out.println("Domingo");
                System.out.println("Fin de semana");
                break;

            default:
                System.out.println("Numero invalido");
                break;
        }

        entrada.close();
    }
}