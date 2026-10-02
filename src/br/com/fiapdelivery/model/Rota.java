package br.com.fiapdelivery.model;

public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void rotaDeEntrega() {

        if (!veiculo.podeTransportar(pacote)) {

            System.out.println("ENTREGA NÃO AUTORIZADA");
            System.out.println("Pacote: " + pacote.getCodigoDoPacote());
            System.out.println("Veículo: " + veiculo.getPlaca());

            if (pacote.getPesoDoPacote() > veiculo.getCapacidadeCarga()) {
                System.out.println("Motivo: peso acima da capacidade.");
            }

            if (pacote.getTamanhoDoPacote() > veiculo.getTamanhoMaximoPacote()) {
                System.out.println("Motivo: tamanho acima do limite.");
            }

            return;
        }

        System.out.println("ENTREGA AUTORIZADA");
        System.out.println("Pacote: " + pacote.getCodigoDoPacote());
        System.out.println("Veículo: " + veiculo.getPlaca());
        System.out.println("Status: Transporte iniciado.");
    }

    public Pacote getPacote() {
        return this.pacote;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }
}