package models;

import interfaces.IDespacho;

public class Despacho implements IDespacho {
    @Override
    public void direccionEntrega(String direccion) {
        System.out.println("el pedido se entregara a la direccion" + direccion);
        tiempoEstimado(direccion);
    }

    @Override
    public void tiempoEstimado(String direccion) {

        System.out.println("el envio llegara en  8 dias habiles");
    }
}
