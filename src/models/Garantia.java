package models;

import interfaces.IGarantia;

public class Garantia implements IGarantia {
    @Override
    public boolean vigente(int codigo) {
        return true;
    }

    @Override
    public void extenderGarantia(int codigo) {
        System.out.println("Garantida extendida por 6 meses");
    }
}
