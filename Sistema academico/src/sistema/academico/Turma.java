
package sistema.academico;
public class Turma
{
    private String codigo;
    private String nome;
    private String local;
    private String horario;
    private String disciplina;
    private String professor;
    private Lista aluno;
    
    public Turma(){
        this.aluno = new Lista();
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String getLocal(){
        return this.local;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public String getHorario(){
        return this.horario;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setProfessor(String prof){
        this.professor = prof;
    }

    public String getProfessor(){
        return this.professor;
    }

    public void matricularAluno(Aluno aluno){
        this.aluno.inserir(aluno);
    }

    public int find(String nome){
         Aluno obj;
         for(int i = 0; i < this.aluno.length(); i++){
            obj = (Aluno)this.aluno.get();
            if(obj.getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return -1;
    }

    public int cancelarAluno(String aluno){
        int pos = this.find(aluno);
        return this.aluno.remover(pos);
    }

    public void ordenaAlunos(){
        /*int i, j;
        Aluno temp;
        for(i = 0; i < this.i; i++){
            for(j = 0; j < i; j++){
                if(this.alunos[i].getNome().compareTo(this.alunos[j].getNome()) < 0){
                    temp = this.alunos[i];
                    this.alunos[i] = this.alunos[j];
                    this.alunos[j] = temp;
                }
            }
        }*/
    }
    public int getQtdeAluno(){
        return this.aluno.length();
    }
    
    public Aluno[] listaAluno(){
        Aluno[] alunos = (Aluno[])this.aluno.get();
        return alunos;
    }
}
