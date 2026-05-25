import java.util.Scanner;

public class ControlAccesoRol {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tipo de usuario ADMIN, USER o GUEST: ");
        String rol = entrada.next().toUpperCase();

        switch (rol) {
            case "ADMIN":
                System.out.println("Acceso total");
                System.out.println("Puede crear, editar, eliminar y consultar datos");
                break;

            case "USER":
                System.out.println("Acceso parcial");
                System.out.println("Puede editar y consultar datos");
                break;

            case "GUEST":
                System.out.println("Solo lectura");
                System.out.println("Puede consultar datos");
                break;

            default:
                System.out.println("Rol invalido");
                break;
        }

        entrada.close();
    }
}