public class Mapa {
    //Tamaño mapa
    private static final int NUM_HABITACIONES = 9;
    //Variables
    private Habitacion[] mapa;
    private int nextHabitacion;
    

    public Mapa() {
        mapa = new Habitacion[NUM_HABITACIONES];
        nextHabitacion = 0;
    }

    public void aniadirHabitacion(Habitacion habitacion) {
        if(habitacion != null && nextHabitacion <= NUM_HABITACIONES) mapa[nextHabitacion++] = habitacion;
    }

    public Habitacion[] getMapa() {
        return mapa;
    }
}
