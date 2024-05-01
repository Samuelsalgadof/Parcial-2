package co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory;

import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.Motocicleta;
import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.Vehiculo;

public class MotocicletaFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearProducto() {
        return new Motocicleta();
    }
}