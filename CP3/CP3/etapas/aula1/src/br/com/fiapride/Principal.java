package br.com.fiapride;

import br.com.fiapride.model.Passageiro;

public class Principal {
    public static void main(String[] args) {
        Passageiro ana = new Passageiro();
        ana.nome = "Ana Silva";
        ana.saldo = 50.0;

        System.out.println("Passageiro: " + ana.nome + " | Saldo: R$ " + ana.saldo);
    }
}
