
package sistema.academico;
public class ListaTurma extends Lista
{
    public Turma find(String nome){
         Turma obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Turma)this.get();
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }
}
