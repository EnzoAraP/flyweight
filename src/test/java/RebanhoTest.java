import org.example.RacaFactory;
import org.example.Rebanho;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RebanhoTest {

    private Rebanho rebanho;

    @BeforeEach
    void setUp() {
        rebanho = new Rebanho();
        rebanho.cadastrar("GIR001", "Gir", "Leite");
        rebanho.cadastrar("GIR002", "Gir", "Leite");
        rebanho.cadastrar("GIR003", "Gir", "Leite");
        rebanho.cadastrar("NEL001", "Nelore", "Corte");
    }

    @Test
    void deveRetornarVacas() {
        List<String> saida = Arrays.asList(
                "Vaca{rgn='GIR001', raca='Gir', aptidao='Leite'}",
                "Vaca{rgn='GIR002', raca='Gir', aptidao='Leite'}",
                "Vaca{rgn='GIR003', raca='Gir', aptidao='Leite'}",
                "Vaca{rgn='NEL001', raca='Nelore', aptidao='Corte'}");

        assertEquals(saida, rebanho.obterVacas());
    }

    @Test
    void deveRetornarTotalRacas() {
        assertEquals(2, RacaFactory.getTotalRacas());
    }
}
