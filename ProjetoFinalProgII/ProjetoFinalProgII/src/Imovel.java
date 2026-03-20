import java.io.StringReader;
import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.time.LocalDate;

public abstract class Imovel {
    protected static Integer contador = 0;
    protected Integer id;
    protected LocalDate dataConstrucao;
    protected LocalDate dataCadastro;
    protected LocalDate dataVendaLocacao;
    protected StatusImovel statusImovel;
    protected Double valorReal;
    protected Endereco endereco;

    public Imovel(LocalDate dataConstrucao, LocalDate dataCadastro, LocalDate dataVendaLocacao, StatusImovel statusImovel, Double valorReal,
                  String rua, String bairro, String cidade, String numero, String estado) {
        this.id = contador ++;
        this.dataConstrucao = dataConstrucao;
        this.dataCadastro = dataCadastro;
        this.dataVendaLocacao = dataVendaLocacao;
        this.statusImovel = statusImovel;
        this.valorReal = valorReal;
        this.endereco = new Endereco(rua, bairro, cidade, numero, estado);

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataVendaLocacao() {
        return dataVendaLocacao;
    }

    public void setDataVendaLocacao(LocalDate dataVendaLocacao) {
        this.dataVendaLocacao = dataVendaLocacao;
    }

    public StatusImovel getStatusImovel() {
        return statusImovel;
    }

    public void setStatusImovel(StatusImovel statusImovel) {
        this.statusImovel = statusImovel;
    }

    public Double getValorReal() {
        return valorReal;
    }

    public void setValorReal(Double valorReal) {
        this.valorReal = valorReal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}