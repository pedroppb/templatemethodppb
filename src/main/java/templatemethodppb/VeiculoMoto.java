package templatemethodppb;

public class VeiculoMoto extends Veiculo{
    private String placa;
    public VeiculoMoto(String marca, String modelo, String tipoCombustivel, String ano,String placa) {
        super(marca, modelo, tipoCombustivel, ano);
        this.placa=placa;
    }
    public String getInfoVeiculo(){
        return "Moto: "+marca+" "+modelo+
                "\nPlaca: "+placa+
                "\nAno: "+ano+
                "\nCombustivel: "+tipoCombustivel;
    }
}
