import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private String nome;
    private String cnpj;
    private List<Imovel> imoveis = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Transacao> transacoes = new ArrayList<>();

    public Imobiliaria(String nome, String cnpj) throws AllException {
        this.setNome(nome);
        this.setCnpj(cnpj);
    }

    public void cadastrarImovel(Imovel newImovel) throws AllException {
        if (newImovel == null){
            throw new AllException("Erro: Não é possivel cadastrar um imovel nulo!");
        }
        this.imoveis.add(newImovel);
    }

    public void cadastrarCliente(Cliente newCliente) throws AllException {
        if (newCliente == null) {
            throw new AllException("Erro: Não é possível cadastrar um cliente nulo!");
        }
        this.clientes.add(newCliente);
    }

    public void cadastrarFuncionario(Funcionario newFuncionario) throws AllException {
        if (newFuncionario == null){
            throw new AllException("Erro: Não é possível cadastrar um funcionario nulo!");
        }
        this.funcionarios.add(newFuncionario);
    }

    public void registrarTransacao(Transacao newTransacao) throws AllException {
        if (newTransacao == null){
            throw new AllException("Erro: Não é possível registrar uma transação nula!");
        }
        this.transacoes.add(newTransacao);
    }

    public void setNome(String newNome) throws AllException {
        if (newNome != null && !newNome.isBlank()) {
            this.nome = newNome;
        } else if (newNome == null){
            throw new AllException("Erro: O nome fornecido não pode ser nulo!");
        } else if (newNome.isBlank()){
            throw new AllException("Erro: O nome não pode estar em branco!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setCnpj(String newCnpj) throws AllException {
        if (newCnpj != null && !newCnpj.isBlank()) {
            this.cnpj = newCnpj;
        } else if(newCnpj == null){
            throw new AllException("Erro: O cnpj fornecido não pode ser nulo!");
        } else if(newCnpj.isBlank()){
            throw new AllException("Erro: O cnpj não pode estar em branco!");
        }
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public List<Imovel> getImoveis() {
        return this.imoveis;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public List<Transacao> getTransacoes() {
        return this.transacoes;
    }

    @Override
    public String toString() {
        return "Imobiliaria{" +
                "nome='" + getNome() + '\'' +
                ", cnpj='" + getCnpj() + '\'' +
                '}';
    }
}