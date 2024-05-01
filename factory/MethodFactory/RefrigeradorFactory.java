package co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory;

import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Electrodomesticos;
import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Refrigerador;


public class RefrigeradorFactory implements ElectrodomesticosFactory {
    @Override
    public Electrodomesticos crearProducto() {
        return new Refrigerador();
    }
}