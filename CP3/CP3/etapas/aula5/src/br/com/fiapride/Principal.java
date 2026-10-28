package br.com.fiapride;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

public class Principal {
    public static void main(String[] args) {
        Passageiro ana = new Passageiro("Ana Silva", 50.0);
        Veiculo onix = new Veiculo("ABC1D23", "Onix");

        Viagem viagem = new Viagem(ana, onix, 10.0);
        System.out.println(viagem.gerarResumo());

        System.out.println("Finalizou? " + viagem.finalizar());
        System.out.println(viagem.gerarResumo());
        System.out.println(ana.gerarResumo());

        Viagem longa = new Viagem(ana, onix, 100.0);
        System.out.println("Viagem longa finalizou? " + longa.finalizar() + " (saldo insuficiente)");
    }
}
