package br.com.fiapride.model;

/** Moto elétrica: herda de Veiculo e assina o contrato Recarregavel. */
public class MotoEletrica extends Veiculo implements Recarregavel {
    private final double autonomiaMaximaKm;
    private double nivelBateria;

    public MotoEletrica(String placa, String modelo, double autonomiaMaximaKm, double nivelInicial) {
        super(placa, modelo);
        if (autonomiaMaximaKm <= 0) {
            throw new IllegalArgumentException("A autonomia máxima deve ser maior que zero.");
        }
        if (nivelInicial < 0 || nivelInicial > NIVEL_MAXIMO_BATERIA) {
            throw new IllegalArgumentException("Nível de bateria deve estar entre 0 e " + NIVEL_MAXIMO_BATERIA);
        }
        this.autonomiaMaximaKm = autonomiaMaximaKm;
        this.nivelBateria = nivelInicial;
    }

    @Override
    public void recarregar() {
        nivelBateria = NIVEL_MAXIMO_BATERIA;
    }

    @Override
    public double getNivelBateria() {
        return nivelBateria;
    }

    @Override
    public double calcularAutonomia() {
        return autonomiaMaximaKm * (nivelBateria / NIVEL_MAXIMO_BATERIA);
    }
}
