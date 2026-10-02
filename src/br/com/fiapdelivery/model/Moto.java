package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String placa, double capacidade, double tamanhoMaximoPacote, boolean possuiBau) {

        super(placa, capacidade, tamanhoMaximoPacote);

        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {

        return this.possuiBau;
    }
}