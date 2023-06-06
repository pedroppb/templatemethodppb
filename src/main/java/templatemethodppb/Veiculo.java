package templatemethodppb;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected String tipoCombustivel;
    protected String ano;

    public Veiculo(String marca, String modelo, String tipoCombustivel, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.ano = ano;
    }

    public abstract String getInfoVeiculo();
}
