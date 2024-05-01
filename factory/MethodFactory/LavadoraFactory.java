package co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory;

import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Lavadora;

public class LavadoraFactory implements ElectrodomesticosFactory {
    @Override
    public Lavadora crearProducto() {
        return new Lavadora();
    }
}
