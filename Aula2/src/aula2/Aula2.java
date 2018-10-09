/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Arrays;

/**
 *
 * @author Anita Pereira
 */
public class Aula2 {
    public static void main(String[] args) {
             System.out.println("Hello world bem sucedido");
             
             double powerof = NumericalUtilities.powerOf(2,10);
             int somaNumerosNaturais = NumericalUtilities.sumOFNaturalNumbersUpTo(3);
             int somaMeio = NumericalUtilities.sumOfNaturalNumbersBetween(2,3);
             int somaPares = NumericalUtilities.sumOfEvenNumbersBetween(2,3);
             int numDivisores = NumericalUtilities.numberOfDivisorsOf(3);
             String primaço = NumericalUtilities.isPrimaço(3);
             
             
             System.out.println(powerof); //Feito
             System.out.println(somaNumerosNaturais); //Done
             System.out.println(somaMeio); //Proximo
             System.out.println(somaPares); // Correto
             System.out.println(numDivisores); //100%
             System.out.println(primaço); //1000% dank
             System.out.println("Exercicio 3 começa daqui para baixo.");
             
             int [] array = {1,2,3,4,5,6,7,8,9,10,20};
             int numero = 2;
             String paraString = ArrayUtilities.toString(array);
             int max = ArrayUtilities.maximumOf(array);
             int min = ArrayUtilities.minimumOf(array);
             int[] copia = ArrayUtilities.copyOf(array);
//             boolean contains= ArrayUtilities.contains(array, numero);
//             boolean Duplicate = ArrayUtilities.containsDuplicates(array, numero);
//             int indexOf = ArrayUtilities.indexOf(array,numero);
//             int addarray = ArrayUtilities.add(array,numero);
//             int remove = ArrayUtilities.remove(numero, array);
             
             
             
//             System.out.println(paraString);
//              System.out.println(max);
//              System.out.println(min);
//              System.out.println(Arrays.toString(copia));
//              System.out.println(contains); 
//             System.out.println(Duplicate);
//             System.out.println(indexOf);
//             System.out.println(addarray);
//             System.out.println(remove);
    }


    
}