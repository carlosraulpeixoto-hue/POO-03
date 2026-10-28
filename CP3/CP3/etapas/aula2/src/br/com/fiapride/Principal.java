package br.com.fiapride;

import br.com.fiapride.model.Passageiro;

public class Principal {

    /** Tenta recarregar e mostra o resultado, centralizando o teste dos métodos. */
    private static void testarRecarga(Passageiro passageiro, double valor) {
        boolean ok = passageiro.adicionarSaldo(valor);
        System.out.println("Recarga de R$ " + valor + (ok ? " aprovada" : " RECUSADA (valor inválido)"));
    }

    public static void main(String[] args) {
        Passageiro ana = new Passageiro();
        ana.nome = "Ana Silva";
        ana.saldo = 50.0;

        testarRecarga(ana, 100.0);
        testarRecarga(ana, -30.0);
        System.out.println(ana.gerarResumo());
    }
}
