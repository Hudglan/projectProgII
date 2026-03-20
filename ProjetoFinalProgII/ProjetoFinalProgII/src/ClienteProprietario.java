import java.util.List;

public class ClienteProprietario extends Pessoa {

    public ClienteProprietario(String cpf, String nome, String email, String profissao, String sexo, String estadoCivil, List<String> telefones, Endereco endereco) {
        super(cpf, nome, email, profissao, sexo, estadoCivil, telefones, endereco);
    }
}
