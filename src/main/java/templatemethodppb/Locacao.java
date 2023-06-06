package templatemethodppb;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Locacao {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private double valor;
    private Veiculo veiculo;
    private String cliente;
    private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Locacao(LocalDateTime inicio, LocalDateTime fim, double valor, Veiculo veiculo, String cliente) {
        this.inicio = inicio;
        this.fim = fim;
        this.valor = valor;
        this.veiculo = veiculo;
        this.cliente = cliente;
    }

    public String getInfoLocacao(){
        return "Locação feita por "+cliente+" por "+ChronoUnit.DAYS.between(inicio,fim)+" dias"+
                "\nDe: "+inicio.format(formatador)+
                "\nAté: "+fim.format(formatador)+
                "\nTotal "+valor+
                "\n"+veiculo.getInfoVeiculo();
    }
}
