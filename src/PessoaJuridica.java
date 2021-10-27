public class PessoaJuridica extends Pessoa {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    // Métodos especiais

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String novaRazaoSocial) {
        razaoSocial = novaRazaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String novoCnpj) {
        cnpj = novoCnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String novoNomeFantasia) {
        nomeFantasia = novoNomeFantasia;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica: Nome=" + super.getNome() + ", Idade=" + super.getIdade() + ", Nome_Fantasia="
                + nomeFantasia + ", Razão_Social=" + razaoSocial + ", Cnpj=" + cnpj;
    }
}
