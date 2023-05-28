import interfaces.*;
import models.*;

public class HomePage implements IHomePage {

    private IAlmacen almacen;
    private IDespacho despacho;
    private IDevolucion devolucion;
    private IEntrega entrega;
    private IGarantia garantia;
    private IPago pago;

    public  HomePage() {
        almacen = new Almacen();
        despacho = new Despacho();
        devolucion = new Devolucion();
        entrega = new Entrega();
        garantia = new Garantia();
        pago = new Pago();
    }


    public void inventario() {
        System.out.println(almacen.inventario());
    }

    public void actualizarInventario(int cantidad) {
        almacen.actualizarInventario(cantidad);
    }

    public void direccionEntrega(String direccion) {
        despacho.direccionEntrega(direccion);
    }

    public void tiempoEstimadoDeEntrega(String direccion) {
        despacho.direccionEntrega(direccion);
    }

    public void generarDevolucion(int codigo, String motivo) {
        devolucion.generarDevolucion(codigo, motivo);
    }
    public void vigenciaGarantia(int codigo) {
        if(garantia.vigente(codigo)){
            System.out.println("Garantia aun vigente");
        };
    }
    public void extenderGarantia(int codigo){
        garantia.extenderGarantia(codigo    );
    }

    public void estadodeEntrega(int codigo){
        entrega.estado(codigo);
    }

    public void fechaDeEntrega(int codigo){
        entrega.fechaEstimada(codigo);
    }

    public void pagar(int monto, String metodo) {
        pago.pagar(monto,metodo);
    }
    }
