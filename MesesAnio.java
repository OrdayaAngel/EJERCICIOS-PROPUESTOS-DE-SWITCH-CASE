import java.util.Scanner;

public class MesesAnio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero de mes del 1 al 12: ");
        int mes = entrada.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                System.out.println("Tiene 31 dias");
                break;

            case 2:
                System.out.println("Febrero");
                System.out.println("Tiene 28 dias");
                break;

            case 3:
                System.out.println("Marzo");
                System.out.println("Tiene 31 dias");
                break;

            case 4:
                System.out.println("Abril");
                System.out.println("Tiene 30 dias");
                break;

            case 5:
                System.out.println("Mayo");
                System.out.println("Tiene 31 dias");
                break;

            case 6:
                System.out.println("Junio");
                System.out.println("Tiene 30 dias");
                break;

            case 7:
                System.out.println("Julio");
                System.out.println("Tiene 31 dias");
                break;

            case 8:
                System.out.println("Agosto");
                System.out.println("Tiene 31 dias");
                break;

            case 9:
                System.out.println("Septiembre");
                System.out.println("Tiene 30 dias");
                break;

            case 10:
                System.out.println("Octubre");
                System.out.println("Tiene 31 dias");
                break;

            case 11:
                System.out.println("Noviembre");
                System.out.println("Tiene 30 dias");
                break;

            case 12:
                System.out.println("Diciembre");
                System.out.println("Tiene 31 dias");
                break;

            default:
                System.out.println("Mes invalido");
                break;
        }

        entrada.close();
    }
}