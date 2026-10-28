package br.com.fiapride.model;

/** Moto a combustão. */
public class Moto extends Veiculo {
    private int cilindradas;
    private double consumoKmPorLitro;
    private double capacidadeTanqueLitros;

    public Moto(String placa, String modelo, int cilindradas, double consumoKmPorLitro, double capacidadeTanqueLitros) {
        super(placa, modelo);
        setCilindradas(cilindradas);
        if (consumoKmPorLitro <= 0 || capacidadeTanqueLitros <= 0) {
            throw new IllegalArgumentException("Consumo e tanque devem ser maiores que zero.");
        }
        this.consumoKmPorLitro = consumoKmPorLitro;
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
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

    @Override
    public double calcularAutonomia() {
        return consumoKmPorLitro * capacidadeTanqueLitros;
    }
}
