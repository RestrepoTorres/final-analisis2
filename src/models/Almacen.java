package models;

import interfaces.IAlmacen;

public class Almacen implements IAlmacen {
    private int cantidadProductos = 0;
    @Override
    public Integer inventario() {
        return cantidadProductos;
    }

    @Override
    public void actualizarInventario(int cantidad) {
        cantidadProductos += cantidad;
    }
}
