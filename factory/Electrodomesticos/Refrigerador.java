package co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos;

public class Refrigerador implements Electrodomesticos {

    @Override
    public String descripcion() {
        return "Refrigerador";
    }

    @Override
    public String precio() {
        return "1000";
    }

    @Override
    public double getPrecio() {
        return Double.parseDouble(precio());
    }

}
