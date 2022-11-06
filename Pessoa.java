public class Pessoa {

    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;

    // métodos getters e setters
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;   
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
        
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    
    // métodos
           
    public void atualizarContato(String endereco, String telefone, String email) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void imprimePessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
    }

}
