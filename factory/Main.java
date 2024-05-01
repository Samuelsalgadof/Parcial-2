package co.edu.uniquindio.parcial2.parcial2.factory;

import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Electrodomesticos;
import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Lavadora;
import co.edu.uniquindio.parcial2.parcial2.factory.Electrodomesticos.Televisor;
import co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory.*;
import co.edu.uniquindio.parcial2.parcial2.factory.MethodFactory.ElectrodomesticosFactory;
import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.Motocicleta;
import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.Vehiculo;
import co.edu.uniquindio.parcial2.parcial2.factory.Vehiculos.coche;

public class Main {
    public static void main(String[] args) {

        VehiculoFactory cocheFactory = new CocheFactory();
        VehiculoFactory motocicletaFactory = new MotocicletaFactory();
        ElectrodomesticosFactory televisorFactory = new TelevisorFactory();
        ElectrodomesticosFactory lavadoraFactory = new LavadoraFactory();


        Producto coche = cocheFactory.crearProducto();
        Producto motocicleta = motocicletaFactory.crearProducto();
        Producto televisor = televisorFactory.crearProducto();
        Producto lavadora = lavadoraFactory.crearProducto();


//        ((coche) coche).setPrecio(20000);
//        ((Motocicleta) motocicleta).setPrecio(5000);
//        ((Televisor) televisor).setPrecio(800);
//        ((Lavadora) lavadora).setPrecio(1000);


        System.out.println("Productos creados:");
        mostrarProductoConPrecio(coche);
        mostrarProductoConPrecio(motocicleta);
        mostrarProductoConPrecio(televisor);
        mostrarProductoConPrecio(lavadora);
    }

    private static void mostrarProductoConPrecio(Producto producto) {
        String descripcion = producto.descripcion();
        double precio = 0;
        if (producto instanceof Vehiculo) {
            precio = ((Vehiculo) producto).getPrecio();
        } else if (producto instanceof Electrodomesticos) {
            precio = ((Electrodomesticos) producto).getPrecio();
        }
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: $" + precio);
        System.out.println();
    }
}