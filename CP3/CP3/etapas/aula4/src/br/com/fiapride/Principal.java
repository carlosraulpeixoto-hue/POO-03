package br.com.fiapride;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Passageiro padrao = new Passageiro();          // construtor padrão
        Passageiro ana = new Passageiro("Ana Silva", 50.0); // construtor customizado
        System.out.println(padrao.gerarResumo());
        System.out.println(ana.gerarResumo());

        Veiculo veiculo = new Veiculo("abc1d23", "Onix");
        System.out.println(veiculo.getModelo() + " - " + veiculo.getPlaca());
        veiculo.atualizarPlaca("XYZ9876");

        try {
            new Veiculo("123", "Fusca");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
