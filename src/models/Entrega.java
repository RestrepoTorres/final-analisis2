package models;

import interfaces.IEntrega;

public class Entrega implements IEntrega {
    @Override
    public void estado(int codigo) {
        System.out.println("en transito");
    }

    @Override
    public void fechaEstimada(int codigo) {
        System.out.println("30/05/2023");
    }
}
