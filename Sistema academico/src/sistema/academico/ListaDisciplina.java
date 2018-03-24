
package sistema.academico;
public class ListaDisciplina extends Lista
{
    public Disciplina find(String nome){
         Disciplina obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Disciplina)this.get();
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }
}
