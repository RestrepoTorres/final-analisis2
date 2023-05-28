package models;

import interfaces.IDevolucion;

public class Devolucion implements IDevolucion {
    public void generarDevolucion(int codigo, String motivo){
        Garantia garantia = new Garantia();
        if(garantia.vigente(codigo)){
            System.out.println("Se estudiara el caso, en 3 dias habiles sera informado");
        }
        else{
            System.out.println("Solicitud por fuera del periodo permitido");
        }
    }

}
