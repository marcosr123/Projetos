package sistema.academico;
@SuppressWarnings("unused")
public class Aluno extends Pessoa
{
    private String curso;

    public Aluno(String nome){
        super(nome);
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
}
