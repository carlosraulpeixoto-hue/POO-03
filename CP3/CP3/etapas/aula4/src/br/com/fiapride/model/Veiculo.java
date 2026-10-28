package br.com.fiapride.model;

/** Representa um veículo da frota do FiapRide. */
public class Veiculo {
    // Placa no padrão antigo (ABC1234) ou Mercosul (ABC1D23)
    private static final String PADRAO_PLACA = "^[A-Z]{3}[0-9][A-Z0-9][0-9]{2}$";

    private String placa;
    private final String modelo; // modelo físico do carro nunca muda: sem setter

    public Veiculo(String placa, String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio.");
        }
        this.modelo = modelo.trim();
        setPlaca(placa);
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    /**
     * Setter privado: ninguém de fora altera a placa diretamente,
     * porque na vida real isso é um processo no Detran, não "editar um campo".
     */
    private void setPlaca(String placa) {
        if (placa == null || !placa.trim().toUpperCase().matches(PADRAO_PLACA)) {
            throw new IllegalArgumentException("Placa inválida: " + placa);
        }
        this.placa = placa.trim().toUpperCase();
    }

    /** Único caminho público para trocar a placa (simula a troca oficial). */
    public void atualizarPlaca(String novaPlaca) {
        setPlaca(novaPlaca);
        System.out.println("Placa atualizada para " + this.placa + " (processo Detran simulado).");
    }
}
