package br.com.fiapride.model;

/** Contrato para veículos elétricos que podem ser recarregados. */
public interface Recarregavel {
    /** Constante de interface: já é public static final. */
    double NIVEL_MAXIMO_BATERIA = 100.0;

    /** Leva a bateria ao nível máximo. */
    void recarregar();

    double getNivelBateria();
}
