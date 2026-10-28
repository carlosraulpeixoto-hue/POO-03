package br.com.fiapride;

import br.com.fiapride.model.Passageiro;

public class Principal {
    public static void main(String[] args) {
        Passageiro ana = new Passageiro();
        ana.setNome("Ana Silva");
        ana.adicionarSaldo(50.0);

        try {
            ana.setNome("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println(ana.getNome() + " tem R$ " + ana.getSaldo());
    }
}
