package co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos;

public class Lavadora implements Electrodomesticos {
    private double precio;

    @Override
    public String descripcion() {
        return "Lavadora";
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
