import java.time.LocalDate;

public class Terreno extends Imovel {

    private Double area;
    private Double largura;
    private Double comprimento;
    private Boolean Aclive;

    public Terreno(LocalDate dataConstrucao, LocalDate dataCadastro, LocalDate dataVendaLocacao, StatusImovel statusImovel, Double valorReal, Endereco endereco, Double area, Double largura, Double comprimento, Boolean aclive) {
        super(dataConstrucao, dataCadastro, dataVendaLocacao, statusImovel, valorReal, endereco);
        this.area = area;
        this.largura = largura;
        this.comprimento = comprimento;
        Aclive = aclive;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Boolean getAclive() {
        return Aclive;
    }

    public void setAclive(Boolean Aclive) {
        this.Aclive = Aclive;
    }
}