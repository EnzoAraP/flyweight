package org.example;

public class Vaca {

    private final String rgn;
    private final Raca raca;

    public Vaca(String rgn, Raca raca) {
        this.rgn = rgn;
        this.raca = raca;
    }

    public String obterVaca() {
        return "Vaca{" +
                "rgn='" + rgn + '\'' +
                ", raca='" + raca.getNome() + '\'' +
                ", aptidao='" + raca.getAptidao() + '\'' +
                '}';
    }
}
