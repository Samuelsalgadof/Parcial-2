package co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos;

public class Televisor implements Electrodomesticos {


    @Override
    public String descripcion() {
        return "Televisor";
    }

    @Override
    public String precio() {
        return "3000";
    }

    @Override
    public double getPrecio() {
        return Double.parseDouble(precio());
    }

}
