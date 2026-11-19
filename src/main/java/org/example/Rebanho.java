package org.example;

import java.util.ArrayList;
import java.util.List;

public class Rebanho {

    private final List<Vaca> vacas = new ArrayList<>();

    public void cadastrar(String rgn, String nomeRaca, String aptidao) {
        Raca raca = RacaFactory.getRaca(nomeRaca, aptidao);
        Vaca vaca = new Vaca(rgn, raca);
        vacas.add(vaca);
    }

    public List<String> obterVacas() {
        List<String> saida = new ArrayList<>();
        for (Vaca vaca : vacas) {
            saida.add(vaca.obterVaca());
        }
        return saida;
    }
}
