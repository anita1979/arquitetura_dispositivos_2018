/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 * 
 * @author Anita Pereira
 * @return Devolve resultados 
 */
class NumericalUtilities {
        public static double powerOf(int base, int potencia) {
            while (potencia != 1) {
                base +=  base;
                potencia--;
            }
        return base;
    }

    static int sumOFNaturalNumbersUpTo(int limite) {
        int resultado = 0;
        for (int i = 0; i != limite+1; i++){
            resultado = resultado +  i;
        }
        
        return resultado;
    }

    static int sumOfNaturalNumbersBetween(int limiteMin, int limiteMax) {
         int resultado = 0;
        for (int i = limiteMin; i != limiteMax+1; i++){
            resultado = resultado +  i;
        }
        
        return resultado;
    }

    static int sumOfEvenNumbersBetween(int limiteMin, int limiteMax) {
         int resultado = 0;
        for (int i = limiteMin; i != limiteMax+1; i++){
            resultado = ( i%2 == 0) ? resultado+=i : resultado;
        }
        
        return resultado;
    }

    static int numberOfDivisorsOf(int numero) {
        int divisores = 0;
        for (int i = 1; i <= numero; i++){
           if (numero % i == 0){
             divisores++;
           }
        }
        
        return divisores;
    }

    static String isPrimaço(int numero) {
        int divisores = 0;
        for (int i = 1; i <= numero; i++){
           if (numero % i == 0){
             divisores++;
           }
        }
        
        if (divisores == 2 || numero == 1) return "É primo.";
        else return "Não é primo.";
        
    }

    
}
