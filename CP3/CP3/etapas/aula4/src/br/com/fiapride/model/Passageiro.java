package br.com.fiapride.model;

/** Representa um passageiro do FiapRide. */
public class Passageiro {
    private String nome;
    private double saldo;

    /** Construtor padrão: reaproveita o customizado com valores iniciais seguros. */
    public Passageiro() {
        this("Passageiro sem nome", 0.0);
    }

    /**
     * @param nome  nome do passageiro (não pode ser vazio)
     * @param saldo saldo inicial (não pode ser negativo)
     */
    public Passageiro(String nome, double saldo) {
        setNome(nome);
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do passageiro não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public double getSaldo() {
        return saldo;
    }

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
