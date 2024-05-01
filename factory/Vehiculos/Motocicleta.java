package co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos;

public class Motocicleta implements Vehiculo {

    @Override
    public String descripcion() {
        return "Motocicleta";
    }

    @Override
    public String precio() {
        return "5000";
    }

    @Override
    public double getPrecio() {
        return 1000.000;
    }
}
