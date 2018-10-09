/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Turma A
 */
public class ArrayUtilities {
    
    public static  String toString(int[]array){
    String str="";
    for (int i=0; i<array.length; i++){
        
    str += array[i] +',';
        
    }
    return str;
    } 
    
    public static int maximumOf(int[]array){
        int max = 0;
        for(int i=0;i<array.length; i++){
            if(max<= array[i]){
                max=array[i];
            }
        }
        
    return max;
    }
    public static int minimumOf(int[]array){
        int min = array[0];
        for(int i=1;i<array.length; i++){
            if(min<= array[i]){
                min=array[i];
            }
        }
        
    return min;
    }  

    public static int[] copyOf(int[] array) {
        int[]ArrayCopy = new int[array.length];
        for(int i=0; i<array.length;i++){
            ArrayCopy[i]= array[i];
            
        }
        return ArrayCopy;
    }
    
     static boolean contains (int value,int[]array){
        boolean contains = false;
        for(int i=0; i<array.length; i++){
            if(array[i]== value){
                contains= true;
            }
        }
        return contains;
    }
    
    static boolean containsDuplicates (int[]array){
        boolean Duplicate= false;
        for (int i =0; i<array.length; i++){
         for (int j=0; j<array.length; j++){
            if(array[i]== array[j]&& i !=j){
            Duplicate= true;
            }
         }   
        }
        return Duplicate;
    }
    
    public static int indexOf(int value,int[]array){
        
        for( int i=0;i<array.length; i++){
            if (array[i]== value){
            return i;
            }
            }
           return -1;
    }

    static int[] add(int value, int[] array) {
        int []addarray = new int[array.length +1];
        for (int i=0;i<array.length; i++){
        addarray[i]=array[i];
     }    
        addarray[addarray.length -1] = value;
  
        return addarray; 
    }
    
    public static int[]remove(int value,int []array){
        if (contains(value, array) != true){
            return array;
        }
        int count =0;
        for(int i=0; i<array.length; i++){
            if(value==array[i])
                count++;
        }
        int[]result = new int[array.length-count];
        count =0;
        for(int i=0; i<result.length ;i++){
        while(value==array[count]){
            count++;
        }
        result[i] = array[count];
        count++;
        }
        return result;
    }
}
