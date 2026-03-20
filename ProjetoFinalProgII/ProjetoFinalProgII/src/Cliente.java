import java.util.List;

public class Cliente extends Pessoa {

    public Cliente(String cpf, String nome, String email, String profissao, String sexo, String estadoCivil, List<String> telefones, Endereco endereco) {
        super(cpf, nome, email, profissao, sexo, estadoCivil, telefones, endereco.bairro, endereco.cidade, endereco.estado, endereco.rua, endereco.numero, endereco);
    }
}