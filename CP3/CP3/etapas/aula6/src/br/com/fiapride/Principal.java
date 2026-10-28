package br.com.fiapride;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Viagem;

public class Principal {
    public static void main(String[] args) {
        Passageiro ana = new Passageiro("Ana Silva", 80.0);
        Carro onix = new Carro("ABC1D23", "Onix", 4);
        Moto cg = new Moto("XYZ9876", "CG 160", 160);

        // Carro e Moto herdam getPlaca() e getModelo() de Veiculo
        System.out.println(onix.getModelo() + " | " + onix.getPlaca() + " | portas: " + onix.getPortas());
        System.out.println(cg.getModelo() + " | " + cg.getPlaca() + " | cc: " + cg.getCilindradas());

        // Viagem aceita qualquer Veiculo: carro ou moto
        Viagem v1 = new Viagem(ana, onix, 10.0);
        Viagem v2 = new Viagem(ana, cg, 5.0);
        v1.finalizar();
        v2.finalizar();
        System.out.println(v1.gerarResumo());
        System.out.println(v2.gerarResumo());
    }
}
