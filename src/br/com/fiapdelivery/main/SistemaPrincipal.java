package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("ABC1234", 1000, 100, 6);

        Moto moto = new Moto("XYZ5678", 20, 30, true);

        Pacote pacotePequeno = new Pacote("BR999", 10, 20, "Pendente");

        Pacote pacoteGrande = new Pacote("BR888", 50, 80, "Pendente");

        System.out.println();
        System.out.println("SISTEMA FIAP DELIVERY");
        System.out.println();

        System.out.println("[ROTA 1] Moto + Pacote Pequeno");
        Rota rota1 = new Rota(pacotePequeno, moto);
        rota1.rotaDeEntrega();

        System.out.println();

        System.out.println("[ROTA 2] Moto + Pacote Grande");
        Rota rota2 = new Rota(pacoteGrande, moto);
        rota2.rotaDeEntrega();

        System.out.println();

        System.out.println("[ROTA 3] Caminhão + Pacote Grande");
        Rota rota3 = new Rota(pacoteGrande, caminhao);
        rota3.rotaDeEntrega();

        System.out.println();
        System.out.println("FIM DOS TESTES");
    }
}