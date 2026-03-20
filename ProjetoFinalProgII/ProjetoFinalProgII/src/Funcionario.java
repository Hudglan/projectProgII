import java.time.LocalDate;
import java.util.List;

public class Funcionario extends Pessoa{

    private LocalDate dataIngresso;
    private String cargo;
    private Double salarioBase;
    private Double percentualComissao;
    private String usuario;
    private String senha;

    public Funcionario(String cpf, String nome, String email, String profissao, String sexo, String estadoCivil, List<String> telefones, Endereco endereco, LocalDate dataIngresso, String cargo, Double salarioBase, Double percentualComissao, String usuario, String senha) {
        super(cpf, nome, email, profissao, sexo, estadoCivil, telefones, endereco);
        this.dataIngresso = dataIngresso;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
        this.usuario = usuario;
        this.senha = senha;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(Double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}