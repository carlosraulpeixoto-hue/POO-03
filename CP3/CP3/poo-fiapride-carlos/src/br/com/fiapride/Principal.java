package br.com.fiapride;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.CarroEletrico;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.MotoEletrica;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Recarregavel;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    private static void imprimirAutonomias(List<Veiculo> frota) {
        for (Veiculo veiculo : frota) {
            System.out.println(veiculo.getModelo() + " -> autonomia: "
                    + String.format("%.1f", veiculo.calcularAutonomia()) + " km");
        }
    }

    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();
        frota.add(new Carro("ABC1D23", "Onix", 4, 12.0, 44.0));
        frota.add(new Moto("XYZ9876", "CG 160", 160, 40.0, 14.0));
        frota.add(new CarroEletrico("EVA1B23", "Dolphin", 291.0, 35.0));
        frota.add(new MotoEletrica("MOT2E45", "Shiver Eletrica", 120.0, 50.0));

        System.out.println("=== Autonomias (polimorfismo) ===");
        imprimirAutonomias(frota);

        System.out.println("\n=== Recarregando os elétricos (interface) ===");
        for (Veiculo veiculo : frota) {
            if (veiculo instanceof Recarregavel) {
                ((Recarregavel) veiculo).recarregar();
            }
        }
        System.out.println("Nível máximo da bateria: " + Recarregavel.NIVEL_MAXIMO_BATERIA + "%");
        imprimirAutonomias(frota);

        System.out.println("\n=== Viagem (associação) ===");
        Passageiro ana = new Passageiro("Ana Silva", 80.0);
        Viagem viagem = new Viagem(ana, frota.get(2), 12.0);
        System.out.println(viagem.gerarResumo());
        viagem.finalizar();
        System.out.println(viagem.gerarResumo());
        System.out.println(ana.gerarResumo());
    }
}
