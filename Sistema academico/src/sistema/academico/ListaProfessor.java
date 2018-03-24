
package sistema.academico;
public class ListaProfessor extends Lista
{
    public Professor find(String nome){
         Professor obj;
         for(int i = 0; i < this.length(); i++){
            obj = (Professor)this.get();
            if(obj.getNome().equalsIgnoreCase(nome)){
                return obj;
            }
        }
        return null;
    }

}
