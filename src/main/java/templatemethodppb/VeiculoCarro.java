package templatemethodppb;

public class VeiculoCarro extends Veiculo{
    private String placa;
    public VeiculoCarro(String marca, String modelo, String tipoCombustivel, String ano,String placa) {
        super(marca, modelo, tipoCombustivel, ano);
        this.placa=placa;
    }

    public String getInfoVeiculo(){
        return "Carro: "+marca+" "+modelo+
                "\nPlaca: "+placa+
                "\nAno: "+ano+
                "\nCombustivel: "+tipoCombustivel;
    }
}
