
package sistema.academico;
public class Pessoa
{
    protected String nome;
    protected int cpf;
    protected String endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
