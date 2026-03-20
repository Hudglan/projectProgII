import java.time.LocalDate;

public class Apartamentos extends Imovel{
    private Integer quartos;
    private Integer suites;
    private Integer salasEstar;
    private Integer salasJantar;
    private Integer vagasGaragem;
    private Double area;
    private Boolean armarioEmbutido;
    private String descricao;
    private Integer andar;
    private Double valorCondominio;
    private Boolean portaria24h;

    public Apartamentos(LocalDate dataContrucao, LocalDate dataCadastro, LocalDate dataVendaLocacao, StatusImovel statusImovel, Double valorReal, Endereco endereco,
                           Integer quartos, Integer suites, Integer salasEstar, Integer salasJantar, Integer vagasGaragem, Double area,
                           Boolean armarioEmbutido, String descricao, Integer andar, Double valorCondominio, Boolean portaria24h) {
        super(dataContrucao, dataCadastro, dataVendaLocacao, statusImovel, valorReal, endereco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
        this.portaria24h = portaria24h;
        this.quartos = quartos;
        this.suites = suites;
        this.salasEstar = salasEstar;
        this.salasJantar = salasJantar;
        this.vagasGaragem = vagasGaragem;
        this.area = area;
        this.armarioEmbutido = armarioEmbutido;
        this.descricao = descricao;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(Double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public Boolean isPortaria24h() {
        return portaria24h;
    }

    public void setPortaria24h(Boolean portaria24h) {
        this.portaria24h = portaria24h;
    }

    public Integer getQuartos() {
        return quartos;
    }

    public void setQuartos(Integer quartos) {
        this.quartos = quartos;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getSalasEstar() {
        return salasEstar;
    }

    public void setSalasEstar(Integer salasEstar) {
        this.salasEstar = salasEstar;
    }

    public Integer getSalasJantar() {
        return salasJantar;
    }

    public void setSalasJantar(Integer salasJantar) {
        this.salasJantar = salasJantar;
    }

    public Integer getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(Integer vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Boolean getArmarioEmbutido() {
        return armarioEmbutido;
    }

    public void setArmarioEmbutido(Boolean armarioEmbutido) {
        this.armarioEmbutido = armarioEmbutido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
