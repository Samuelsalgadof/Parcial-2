package co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory;

import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.Vehiculo;
import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.Bicicletas;


public class BicicletaFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearProducto() {
        return new Bicicletas();
    }
}
