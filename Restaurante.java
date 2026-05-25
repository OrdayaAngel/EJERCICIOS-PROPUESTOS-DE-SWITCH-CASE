import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int plato;
        double precio = 0;
        String nombrePlato = "";

        System.out.println("===== RESTAURANTE =====");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        System.out.print("Elija una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("===== DESAYUNO =====");
                System.out.println("1. Pan con pollo - S/ 6.00");
                System.out.println("2. Cafe con leche - S/ 4.00");
                System.out.println("3. Jugo surtido - S/ 5.00");
                System.out.print("Elija un plato: ");
                plato = entrada.nextInt();

                switch (plato) {
                    case 1:
                        nombrePlato = "Pan con pollo";
                        precio = 6.00;
                        break;
                    case 2:
                        nombrePlato = "Cafe con leche";
                        precio = 4.00;
                        break;
                    case 3:
                        nombrePlato = "Jugo surtido";
                        precio = 5.00;
                        break;
                    default:
                        System.out.println("Plato invalido");
                        break;
                }
                break;

            case 2:
                System.out.println("===== ALMUERZO =====");
                System.out.println("1. Arroz con pollo - S/ 12.00");
                System.out.println("2. Tallarin saltado - S/ 14.00");
                System.out.println("3. Lomo saltado - S/ 18.00");
                System.out.print("Elija un plato: ");
                plato = entrada.nextInt();

                switch (plato) {
                    case 1:
                        nombrePlato = "Arroz con pollo";
                        precio = 12.00;
                        break;
                    case 2:
                        nombrePlato = "Tallarin saltado";
                        precio = 14.00;
                        break;
                    case 3:
                        nombrePlato = "Lomo saltado";
                        precio = 18.00;
                        break;
                    default:
                        System.out.println("Plato invalido");
                        break;
                }
                break;

            case 3:
                System.out.println("===== CENA =====");
                System.out.println("1. Caldo de gallina - S/ 10.00");
                System.out.println("2. Pollo a la plancha - S/ 15.00");
                System.out.println("3. Ensalada mixta - S/ 8.00");
                System.out.print("Elija un plato: ");
                plato = entrada.nextInt();

                switch (plato) {
                    case 1:
                        nombrePlato = "Caldo de gallina";
                        precio = 10.00;
                        break;
                    case 2:
                        nombrePlato = "Pollo a la plancha";
                        precio = 15.00;
                        break;
                    case 3:
                        nombrePlato = "Ensalada mixta";
                        precio = 8.00;
                        break;
                    default:
                        System.out.println("Plato invalido");
                        break;
                }
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }

        if (precio > 0) {
            System.out.println("Plato elegido: " + nombrePlato);
            System.out.println("Precio: S/ " + precio);
        }

        entrada.close();
    }
}