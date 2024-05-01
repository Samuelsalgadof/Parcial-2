package co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory;

import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Electrodomesticos;
import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Televisor;

public class TelevisorFactory implements ElectrodomesticosFactory {
    @Override
    public Electrodomesticos crearProducto() {
        return new Televisor();
    }
}