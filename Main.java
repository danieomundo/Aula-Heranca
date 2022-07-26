public class Main {

    public static void main (String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNome("Daniele Pimenta");
        cliente.atualizarContato("Rua dos Trouxas", "21999999999", "danielepimenta@id.uff.br");
        cliente.atualizaPontosFidelidade(50);
        cliente.imprimePessoa();

        System.out.println("------------------------------------");

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Noah Pimenta");
        funcionario.atualizarContato("Rua dos Alfeneiros", "21999999990", "noahpimenta@id.uff.br");
        funcionario.imprimePessoa();
        funcionario.promover();

    }
  
}
