public class PessoaFisica extends Pessoa {

    private String cpf;

    // Métodos especiais

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String novoCpf) {
        cpf = novoCpf;
    }

    @Override
    public String toString() {
        return "Pessoa Física: Nome=" + super.getNome() + ", Idade=" + super.getIdade() + ", Cpf=" + cpf;
    }
}
