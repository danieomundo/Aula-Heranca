public class Cliente extends Pessoa {

    private int pontosFidelidade = 0;

    public void atualizaPontosFidelidade(int pontos) {
        this.pontosFidelidade += pontos;
    }

    @Override
    public void imprimePessoa() {

        /*
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
        */

        super.imprimePessoa(); // maneira fácil de herdar o método da classe mãe.
        System.out.println("Pontos atualizados: " + this.pontosFidelidade);

    }

}
