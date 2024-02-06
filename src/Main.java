import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] asientos = new char[10][10];
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila = 0, asiento = 0;
        String respuesta;

        for (int f = 0; f < asientos.length ; f++) {
            for (int c = 0; c < asientos.length; c++) {
                asientos[f][c] = 'L';
            }
        }

        System.out.println("----------- Bienvenido al sistema de reservas -----------");

        while(bandera != true){
            System.out.println("Desea ver los asientos disponibles? (Y/N)");
            String verMapa = teclado.next();

            if (verMapa.equalsIgnoreCase("Y")) {
                mostrarAsientos(asientos);
            }

            boolean estaOk = false;
            while (estaOk != true){
                System.out.println("Ingrese Fila y Asiento a reservar: ");
                System.out.print("Fila (Entre 0 y 9): ");
                fila = teclado.nextInt();

                System.out.print("Asiento (entre 0 y 9): ");
                asiento = teclado.nextInt();

                if (fila <= 9 && fila >= 0){
                    if (asiento <=9 && asiento >= 0){
                        estaOk = true;
                    }
                    else {
                        System.out.println("El numero de asiento no es valido");
                    }
                }
                else {
                    System.out.println("El numero de fila no es valido");
                }
            }


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

    static void mostrarAsientos(char[][] asientos) {
        for (int f = 0; f < asientos.length; f++) {
            System.out.print("Fila: "+ f + " ");
            for (int c = 0; c < asientos.length; c++){
                System.out.print("["+asientos[f][c]+ "]");
            }
            System.out.println("");
        }
    }
}