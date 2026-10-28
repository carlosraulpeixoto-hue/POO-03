package br.com.fiapride.model;

/** Representa um passageiro do FiapRide. */
public class Passageiro {
    private String nome;
    private double saldo;

    public String getNome() {
        return nome;
    }

    /** @throws IllegalArgumentException se o nome for nulo ou vazio */
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do passageiro não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public double getSaldo() {
        return saldo;
    }

    // Não existe setSaldo: o saldo só muda por regras de negócio (adicionar/debitar).

    public boolean adicionarSaldo(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public String gerarResumo() {
        return nome + " - saldo: R$ " + String.format("%.2f", saldo);
    }
}
