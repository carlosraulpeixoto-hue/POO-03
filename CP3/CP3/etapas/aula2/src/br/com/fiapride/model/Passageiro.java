package br.com.fiapride.model;

/** Representa um passageiro do FiapRide. */
public class Passageiro {
    public String nome;
    public double saldo;

    /**
     * Adiciona saldo à carteira do passageiro.
     * @param valor valor a ser adicionado (deve ser maior que zero)
     * @return true se o saldo foi adicionado, false se o valor era inválido
     */
    public boolean adicionarSaldo(double valor) {
        if (valor <= 0) {
            return false; // evita "recargas" negativas ou zeradas
        }
        saldo += valor;
        return true;
    }

    public String gerarResumo() {
        return nome + " - saldo: R$ " + String.format("%.2f", saldo);
    }
}
