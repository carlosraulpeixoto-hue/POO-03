package br.com.fiapride.model;

/** Carro é um tipo de Veiculo (herança). */
public class Carro extends Veiculo {
    private int portas;

    public Carro(String placa, String modelo, int portas) {
        super(placa, modelo); // placa e modelo são privados na mãe: só o super() chega neles
        setPortas(portas);
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
}
