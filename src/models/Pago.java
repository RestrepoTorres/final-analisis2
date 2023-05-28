package models;

import interfaces.IPago;

public class Pago implements IPago {
    @Override
    public void pagar(int monto, String metodo){
        System.out.println("Validando pago...");
        System.out.println("Pago efectuado");
    };

}
