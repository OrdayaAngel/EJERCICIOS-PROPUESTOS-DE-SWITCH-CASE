import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 1000;
        double monto;

        System.out.println("===== SISTEMA BANCARIO =====");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");
        System.out.print("Elija una opcion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese monto a depositar: ");
                monto = entrada.nextDouble();

                if (monto > 0) {
                    saldo = saldo + monto;
                    System.out.println("Deposito realizado correctamente");
                    System.out.println("Saldo actual: " + saldo);
                } else {
                    System.out.println("Monto invalido");
                }
                break;

            case 2:
                System.out.print("Ingrese monto a retirar: ");
                monto = entrada.nextDouble();

                if (monto <= 0) {
                    System.out.println("Monto invalido");
                } else if (monto > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - monto;
                    System.out.println("Retiro realizado correctamente");
                    System.out.println("Saldo actual: " + saldo);
                }
                break;

            case 3:
                System.out.println("Su saldo actual es: " + saldo);
                break;

            case 4:
                System.out.println("Gracias por usar el sistema");
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }

        entrada.close();
    }
}