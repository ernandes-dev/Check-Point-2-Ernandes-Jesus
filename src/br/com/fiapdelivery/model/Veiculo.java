package br.com.fiapdelivery.model;

public class Veiculo {

    private String placa;
    private double capacidadeCarga;
    private double tamanhoMaximoPacote;

    public Veiculo(String placa, double capacidadeCarga, double tamanhoMaximoPacote) {
        this.setPlaca(placa);
        this.setCapacidadeCarga(capacidadeCarga);
        this.setTamanhoMaximoPacote(tamanhoMaximoPacote);
    }

    public boolean podeTransportar(Pacote pacote) {
        return pacote.getPesoDoPacote() <= this.capacidadeCarga
                && pacote.getTamanhoDoPacote() <= this.tamanhoMaximoPacote;
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    private void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga >= 0) {
            this.capacidadeCarga = capacidadeCarga;
        } else {
            System.out.println("Erro: A capacidade de carga não pode ser negativa.");
        }
    }

    public double getTamanhoMaximoPacote() {
        return this.tamanhoMaximoPacote;
    }

    private void setTamanhoMaximoPacote(double tamanhoMaximoPacote) {
        if (tamanhoMaximoPacote >= 0) {
            this.tamanhoMaximoPacote = tamanhoMaximoPacote;
        } else {
            System.out.println("Erro: O tamanho máximo do pacote não pode ser negativo.");
        }
    }
}