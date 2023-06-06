package templatemethodppb;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
class LocacaoTest {
    @Test
    void deveRetornarInfoLocacaoCarro() {
        VeiculoCarro carro = new VeiculoCarro("Fiat", "Uno", "Flex", "2015", "asd-1511");
        Locacao locacao = new Locacao(LocalDateTime.of(2023, 5, 1, 12, 15, 0),
                LocalDateTime.of(2023, 5, 5, 12, 15, 0),
                300, carro, "pedro barrocas"
        );
        assertEquals("Locação feita por pedro barrocas por 4 dias\n" +
                "De: 01/05/2023 12:15:00\n" +
                "Até: 05/05/2023 12:15:00\n" +
                "Total 300.0\n" +
                "Carro: Fiat Uno\n" +
                "Placa: asd-1511\n" +
                "Ano: 2015\n" +
                "Combustivel: Flex", locacao.getInfoLocacao());
    }

    @Test
    void deveRetornarInfoLocacaoMoto() {
        VeiculoMoto moto = new VeiculoMoto("Honda", "XRE 190", "Gasolina", "2015", "hed-1570");
        Locacao locacao = new Locacao(LocalDateTime.of(2023, 5, 1, 12, 15, 0),
                LocalDateTime.of(2023, 5, 5, 12, 15, 0),
                300, moto, "pedro barrocas"
        );
        assertEquals("Locação feita por pedro barrocas por 4 dias\n" +
                "De: 01/05/2023 12:15:00\n" +
                "Até: 05/05/2023 12:15:00\n" +
                "Total 300.0\n" +
                "Moto: Honda XRE 190\n" +
                "Placa: hed-1570\n" +
                "Ano: 2015\n" +
                "Combustivel: Gasolina", locacao.getInfoLocacao());
    }

    @Test
    void deveRetornarInfoLocacaoPatinete() {
        VeiculoPatineteEletrico patineteEletrico = new VeiculoPatineteEletrico("foston", "s09 pro", "Eletrico", "2022");
        Locacao locacao = new Locacao(LocalDateTime.of(2023, 5, 1, 12, 15, 0),
                LocalDateTime.of(2023, 5, 5, 12, 15, 0),
                300, patineteEletrico, "pedro barrocas"
        );
        assertEquals("Locação feita por pedro barrocas por 4 dias\n" +
                "De: 01/05/2023 12:15:00\n" +
                "Até: 05/05/2023 12:15:00\n" +
                "Total 300.0\n" +
                "PatineteEletrico: foston s09 pro\n" +
                "Ano: 2022\n" +
                "Combustivel: Eletrico", locacao.getInfoLocacao());
    }
}
