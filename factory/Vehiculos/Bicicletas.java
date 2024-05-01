package co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos;

public class Bicicletas implements Vehiculo {
    @Override
    public String descripcion() {
        return "Bicicletas  ";
    }

    @Override
    public String precio() {
        return "100";
    }

    @Override
    public double getPrecio() {
        return 300.000;
    }
}
