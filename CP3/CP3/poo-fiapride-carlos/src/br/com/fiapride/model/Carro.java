package br.com.fiapride.model;

/** Carro a combustão. */
public class Carro extends Veiculo {
    private int portas;
    private double consumoKmPorLitro;
    private double capacidadeTanqueLitros;

    public Carro(String placa, String modelo, int portas, double consumoKmPorLitro, double capacidadeTanqueLitros) {
        super(placa, modelo);
        setPortas(portas);
        if (consumoKmPorLitro <= 0 || capacidadeTanqueLitros <= 0) {
            throw new IllegalArgumentException("Consumo e tanque devem ser maiores que zero.");
        }
        this.consumoKmPorLitro = consumoKmPorLitro;
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        if (portas < 2) {
            throw new IllegalArgumentException("Um carro deve ter ao menos 2 portas.");
        }
        this.portas = portas;
    }

    @Override
    public double calcularAutonomia() {
        return consumoKmPorLitro * capacidadeTanqueLitros;
    }
}
