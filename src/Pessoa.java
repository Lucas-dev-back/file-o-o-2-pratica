public abstract class Pessoa {

    private String nome;
    private int idade;

    public void fazerAniversario() {
        idade++;
    }

    // Métodos especiais
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa: Nome=" + nome + ", Idade=" + idade;
    }
}