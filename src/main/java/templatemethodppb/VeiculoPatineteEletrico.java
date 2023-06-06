package templatemethodppb;

public class VeiculoPatineteEletrico extends Veiculo{
    public VeiculoPatineteEletrico(String marca, String modelo, String tipoCombustivel, String ano) {
        super(marca, modelo, tipoCombustivel, ano);
    }
    public String getInfoVeiculo(){
        return "PatineteEletrico: "+marca+" "+modelo+"\nAno: "+ano+"\nCombustivel: "+tipoCombustivel;
    }
}
