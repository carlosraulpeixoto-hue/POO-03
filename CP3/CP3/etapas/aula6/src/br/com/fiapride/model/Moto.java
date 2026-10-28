package br.com.fiapride.model;

/** Moto é um tipo de Veiculo (herança). */
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, int cilindradas) {
        super(placa, modelo);
        setCilindradas(cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("As cilindradas devem ser maiores que zero.");
        }
        this.cilindradas = cilindradas;
    }
}
