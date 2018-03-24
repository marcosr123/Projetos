
package sistema.academico;
@SuppressWarnings("unused")
public class Professor extends Pessoa{
    private String departamento;
    public Professor(String nome){
        super(nome);
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
