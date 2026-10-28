package br.com.fiapride;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();
        frota.add(new Carro("ABC1D23", "Onix", 4, 12.0, 44.0));
        frota.add(new Moto("XYZ9876", "CG 160", 160, 40.0, 14.0));

        // Polimorfismo: a mesma chamada, comportamentos diferentes por tipo real do objeto
        for (Veiculo veiculo : frota) {
            System.out.println(veiculo.getModelo() + " -> autonomia: "
                    + String.format("%.1f", veiculo.calcularAutonomia()) + " km");
        }
    }
}
