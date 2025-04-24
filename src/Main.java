import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[3];

        for (int i = 0; i < 3; ++i) {
            System.out.print("Ingrese el nombre del Jugador " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la edad del Jugador " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese la posicion del Jugador " + (i + 1) + ": ");
            String posicion = scanner.nextLine();
            System.out.print("Ingrese el equipo del Jugador " + (i + 1) + ": ");
            String equipo = scanner.nextLine();

            jugadores[i] = new Jugador(nombre, edad, posicion, equipo);
        }

        System.out.println("\n## DATOS DE LOS JUGADORES ##");
        for (Jugador jugador : jugadores) {
            jugador.infoJugador();

        }

        scanner.close();
    }
}
