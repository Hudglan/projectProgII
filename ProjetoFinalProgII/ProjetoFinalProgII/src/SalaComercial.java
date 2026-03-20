import java.time.LocalDate;

public class SalaComercial extends Imovel{

    private Double area;
    private Integer qtdBanheiros;
    private Integer qtdComodos;

    public SalaComercial(LocalDate dataConstrucao, LocalDate dataCadastro, LocalDate dataVendaLocacao, StatusImovel statusImovel, Double valorReal, String rua, String bairro, String cidade, String numero, String estado, Double area, Integer qtdBanheiros, Integer qtdComodos) {
        super(dataConstrucao, dataCadastro, dataVendaLocacao, statusImovel, valorReal, rua, bairro, cidade, numero, estado);
        this.area = area;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdComodos = qtdComodos;
        this.setEndereco(new Endereco(rua, numero, bairro, cidade, estado));
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdBanheiros(Integer qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }

    public Integer getQtdComodos() {
        return qtdComodos;
    }

    public void setQtdComodos(Integer qtdComodos) {
        this.qtdComodos = qtdComodos;
    }
}
