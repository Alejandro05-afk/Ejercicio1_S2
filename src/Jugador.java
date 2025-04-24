public class Jugador {
    public String nombre;
    public int edad;
    public String posicion;
    public String equipo;

    // Corrección del parámetro 'pocision' a 'posicion'
    public Jugador(String nombre, int edad, String posicion, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public void infoJugador() {
        System.out.println(this.nombre +
                "\nTiene " + this.edad + " años, juega de " + this.posicion +
                ", su equipo es el " + this.equipo);
    }
}

