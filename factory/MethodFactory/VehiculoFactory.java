package co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory;

import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.Vehiculo;

public interface VehiculoFactory extends AlquilerFactory {
    Vehiculo crearProducto();
}