public class App {
    public static void main(String[] args) {

        comPossivelCast();
        normal();
    }

    private static void normal() {
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaFisica.setNome("Jorge");
        pessoaFisica.setIdade(15);
        // sem cast
        pessoaFisica.setCpf("1662728219");

        pessoaJuridica.setNome("Armando");
        pessoaJuridica.setNomeFantasia("Mercadinho dois irmãos");
        pessoaJuridica.setRazaoSocial("Eu não sei oq é isso");
        pessoaJuridica.setCnpj("23812371923");
        pessoaJuridica.setIdade(60);
    }

    private static void comPossivelCast() {
        Pessoa p1 = new PessoaJuridica();
        Pessoa p2 = new PessoaFisica();

        p1.setNome("Lucas");
        p1.setIdade(2);
        // Olha o cast
        ((PessoaJuridica) p1).setCnpj("");

        p2.setNome("Carlos");
        p2.setIdade(4);
        p2.fazerAniversario();

        System.out.println(p1);
        System.out.println(p2);
    }

}
