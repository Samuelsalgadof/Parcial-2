package co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos;

public class coche  implements Vehiculo {
    @Override
    public String descripcion() {
        return "Coche";
    }

    @Override
    public String precio() {
        return "2000";
    }


    @Override
    public double getPrecio() {
        return Double.parseDouble(precio());
    }
}
