package org.example;

public class Raca {

    private final String nome;
    private final String aptidao;

    public Raca(String nome, String aptidao) {
        this.nome = nome;
        this.aptidao = aptidao;
    }

    public String getNome() {
        return nome;
    }

    public String getAptidao() {
        return aptidao;
    }
}
