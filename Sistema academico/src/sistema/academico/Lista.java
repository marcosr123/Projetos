
package sistema.academico;

import java.util.ArrayList;

public class Lista
{
    private ArrayList <Object> array;
    private int i;

    public Lista(){
        this.array = new ArrayList <Object>();
        
    }

    public boolean have(){
        return (this.i > 0)?true:false;
    }

    public void inserir(Object obj){
       /* this.array.add(obj);
        int i = this.i - 1;
        Object temp;
        while((i >= 0) && obj.compareTo(this.array.get(i)) < 0){
            temp = this.array.get(i) ;
            this.array = t/his.array.add(obj) ;
            this.array[i+1] = temp;
            i--;
        }
        this.i++;
        return 0;
        this.array[this.i] = obj;
        this.i++;*/
    }
    public int remover(int pos){
        if(pos >= 0 && pos < this.i){
            for(int i = pos; i < this.i; i++){
                //this.array = this.array;
            }
            this.i--;
            return 1;
        }else{
            return 0;
        }
    }

    public int length(){
        return this.i;
    }

    public Object get(int pos){
        return this.array.get(pos);
    }

    public Object get(){
        return this.array.get(0);
    }

    /*
    public void quickSort(int arr[], int left, int right){
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
    
    private int partition(int arr[], int left, int right){
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }
    */
}
