package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {

    private int quantidadeDeEixos;

    public Caminhao(String placa, double capacidade, double tamanhoMaximoPacote, int quantidadeDeEixos) {

        super(placa, capacidade, tamanhoMaximoPacote);

        this.setQuantidadeDeEixos(quantidadeDeEixos);
    }

    public int getQuantidadeDeEixos() {

        return this.quantidadeDeEixos;
    }

    private void setQuantidadeDeEixos(int quantidadeDeEixos) {

        this.quantidadeDeEixos = quantidadeDeEixos;
    }
}