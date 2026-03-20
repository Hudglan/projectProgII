import java.time.LocalDate;

public class Transacao {
    private static Integer contador = 0;
    private Integer id;
    private int numeroContrato;
    private LocalDate data;
    private TipoTransacao tipo;
    private Double valorTotal;
    private Double valorComissao;

    public Transacao(int numeroContrato, LocalDate data, TipoTransacao tipo, Double valorTotal, Double valorComissao) {
        this.id = Transacao.contador++;
        this.numeroContrato = numeroContrato;
        this.data = data;
        this.tipo = tipo;
        this.valorTotal = valorTotal;
        this.valorComissao = valorComissao;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
}
