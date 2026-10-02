package br.com.fiapdelivery.model;

public class Pacote {
	
	private String codigoDoPacote;
	private double pesoDoPacote;
	private double tamanhoDoPacote;
	private String statusDaEntrega;
	
	public Pacote(String codigoDoPacote, double pesoDoPacote, double tamanhoDoPacote, String statusDaEntrega) {
		
		this.codigoDoPacote = codigoDoPacote;
		this.pesoDoPacote = pesoDoPacote;
		this.statusDaEntrega = statusDaEntrega;
		this.tamanhoDoPacote = tamanhoDoPacote;
	
	}
	
	public String getCodigoDoPacote() {
		return this.codigoDoPacote;
	}
	public String getStatusDaEntrega() {
		return this.statusDaEntrega;
	}
	public double getPesoDoPacote() {
		return this.pesoDoPacote;
	}
	public double getTamanhoDoPacote() {
		return this.tamanhoDoPacote;
	}
	
	public void setAtualizarStatus(String novoStatus) {

        if (novoStatus.equalsIgnoreCase("Pendente") 
        		||  novoStatus.equalsIgnoreCase("Em trânsito")
        		|| novoStatus.equalsIgnoreCase("Entregue")) {
        	this.statusDaEntrega = novoStatus;
        	
        	 System.out.println("Status atualizado para: " + this.statusDaEntrega);

        } else {

            System.out.println("Erro: Status de entrega inválido.");
        }
    
	}
        	
}
 
           