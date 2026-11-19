package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RacaFactory {

    private static final Map<String, Raca> racas = new ConcurrentHashMap<>();

    public static Raca getRaca(String nome, String aptidao) {
        return racas.computeIfAbsent(nome, nomeRaca -> new Raca(nomeRaca, aptidao));
    }

    public static int getTotalRacas() {
        return racas.size();
    }
}
