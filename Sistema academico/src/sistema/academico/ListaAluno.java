
package sistema.academico;
public class ListaAluno extends Lista
{
    public Aluno find(String nome){
         Aluno obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Aluno)this.get();
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }
}
