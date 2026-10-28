package br.com.fiapride.model;

/**
 * Viagem TEM-UM passageiro solicitante e TEM-UM veículo (associação).
 * Guardamos os objetos inteiros, e não só o nome, para a viagem conseguir
 * cobrar o saldo do passageiro ao ser finalizada.
 */
public class Viagem {
    private static final double VALOR_POR_KM = 2.50;

    private final Passageiro solicitante;
    private final Veiculo veiculo;
    private final double distanciaKm;
    private boolean finalizada;

    public Viagem(Passageiro solicitante, Veiculo veiculo, double distanciaKm) {
        if (solicitante == null || veiculo == null) {
            throw new IllegalArgumentException("Passageiro e veículo são obrigatórios.");
        }
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("A distância deve ser maior que zero.");
        }
        this.solicitante = solicitante;
        this.veiculo = veiculo;
        this.distanciaKm = distanciaKm;
    }

    public double calcularValor() {
        return distanciaKm * VALOR_POR_KM;
    }

    /** Cobra o passageiro e encerra a viagem. @return false se não havia saldo ou já estava finalizada */
    public boolean finalizar() {
        if (finalizada) {
            return false;
        }
        boolean pago = solicitante.debitarSaldo(calcularValor());
        if (pago) {
            finalizada = true;
        }
        return pago;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public String gerarResumo() {
        return "Viagem de " + solicitante.getNome() + " no " + veiculo.getModelo()
                + " (" + veiculo.getPlaca() + ") - " + distanciaKm + " km - R$ "
                + String.format("%.2f", calcularValor()) + (finalizada ? " [FINALIZADA]" : " [PENDENTE]");
    }
}
