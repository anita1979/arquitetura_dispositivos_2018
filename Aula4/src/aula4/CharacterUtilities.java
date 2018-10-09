/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Anita Pereira
 */
public class CharacterUtilities {

    public static char lowerLetterSuccessorOf(char letra) {

        if (letra == 'z') {
            return 'a';
        }

        int next = (int) letra;
        next++;
        char nextLetter = (char) next;
        return nextLetter;
    }

    public static char lowerLetterPredecessorOf(char letra) {

        if (letra == 'a') {
            return 'z';
        }

        int previous = (int) letra;
        previous--;
        char previousLetter = (char) previous;
        return previousLetter;
    }

    public static char lowerLetterSuccessorStepsOf(char letra, int numero) {

        if (letra == 'z') {
            return 'a';
        }

        int next = (int) letra;
        next += numero;
        char nextLetter = (char) next;
        return nextLetter;
    }

    public static char lowerLetterPredecessorStepsOf(char letra, int numero) {

        if (letra == 'a') {
            return 'z';
        }

        int previous = (int) letra;
        previous -= numero;
        char previouSteps = (char) previous;
        return previouSteps;
    }

    public static int occurrencesOfCharacterIn(char[] array, char letra) {

        int count = 0;
        for (int i = 0; i != array.length; i++) {
            if (array[i] == letra) {
                count++;
            }
        }
        return count;
    }

    public static void replaceCharacterIn(char[] array, char letra, char letraSub) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == letra) {
                array[i] = letraSub;
            }
        }
    }

    public static char[] concatenationOf(char[] letras, char[] letrasA) {
        char[] finalArray = new char[letras.length + letrasA.length];

        for (int i = 0; i < letras.length; i++) {
            finalArray[i] = letras[i];
        }

        int index = letras.length;

        for (int i = 0; i < letrasA.length; i++) {
            finalArray[index] = letrasA[i];
            index++;
        }
        return finalArray;
    }

    public static char[] copyOfPartOf(int indiceInicial, int indiceFinal, char[] array) {
        char[] copy = new char[indiceFinal - indiceInicial + 1];
        
        int index = 0;
        for (int i = indiceInicial; i <= indiceFinal; i++) {          
            copy[index] = array[i];
            index++;
        }
        
       return copy;    
    }

}
