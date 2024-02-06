import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] asientos = new char[10][10];
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila, asiento;
        String respuesta;

        for (int f = 0; f < asientos.length ; f++) {
            for (int c = 0; c < asientos.length; c++) {
                asientos[f][c] = 'L';
            }
        }

        System.out.println("----------- Bienvenido al sistema de reservas -----------");

        while(bandera != true){
            System.out.println("Ingrese Fila y Asiento a reservar: ");
            System.out.print("Fila (Entre 0 y 9): ");
            fila = teclado.nextInt();

            System.out.print("Asiento (entre 0 y 9): ");
            asiento = teclado.nextInt();

            if (asientos[fila][asiento] == 'L'){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente.");

            } else {
                System.out.println("El asiento esta ocupado, elija otro.");
            }
            System.out.println("Desea reservar otro asiento? (Y/N)");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("n")){
                bandera = true;
            }
        }
    }
}