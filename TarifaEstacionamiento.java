import java.util.Scanner;

public class TarifaEstacionamiento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double tarifaHora = 0;
        double total;
        String vehiculo = "";

        System.out.println("===== ESTACIONAMIENTO =====");
        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camion");
        System.out.print("Seleccione tipo de vehiculo: ");
        int opcion = entrada.nextInt();

        System.out.print("Ingrese cantidad de horas: ");
        double horas = entrada.nextDouble();

        switch (opcion) {
            case 1:
                vehiculo = "Moto";
                tarifaHora = 2.00;
                break;

            case 2:
                vehiculo = "Auto";
                tarifaHora = 5.00;
                break;

            case 3:
                vehiculo = "Camion";
                tarifaHora = 10.00;
                break;

            default:
                System.out.println("Tipo de vehiculo invalido");
                break;
        }

        if (tarifaHora > 0) {
            if (horas <= 0) {
                System.out.println("Cantidad de horas invalida");
            } else {
                total = tarifaHora * horas;
                System.out.println("Vehiculo: " + vehiculo);
                System.out.println("Tarifa por hora: S/ " + tarifaHora);
                System.out.println("Total a pagar: S/ " + total);
            }
        }

        entrada.close();
    }
}