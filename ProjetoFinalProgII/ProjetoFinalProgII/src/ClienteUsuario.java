import java.util.List;

public class ClienteUsuario extends Pessoa {

    private List<Cliente> fiadores;
    private List<String> indicacoes;

    public ClienteUsuario(String cpf, String nome, String email, String profissao, String sexo, String estadoCivil, List<String> telefones, Endereco endereco, List<Cliente> fiadores, List<String> indicacoes) {
        super(cpf, nome, email, profissao, sexo, estadoCivil, telefones,endereco.bairro, endereco.cidade, endereco.estado, endereco.rua, endereco.numero, endereco);
        this.fiadores = fiadores;
        this.indicacoes = indicacoes;
    }

    public List<String> getIndicacoes() {
        return indicacoes;
    }

    public void setIndicacoes(List<String> indicacoes) {
        this.indicacoes = indicacoes;
    }

    public List<Cliente> getFiadores() {
        return fiadores;
    }

    public void setFiadores(List<Cliente> fiadores) {
        this.fiadores = fiadores;
    }
}