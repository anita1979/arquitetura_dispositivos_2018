package aula3_;

import java.lang.Math;
import java.util.Arrays;

/**
 *
 * @author Anita Pereira
 */
public class Aula3_ {

    /**
     * @param args the command line arguments
     */
    //4º
    public static void increment(int value) {
        value++;
        int x = 0;
    }
    public static void incrementFirstof(final int[]values){
        values[0]++;
    }

    public static void main(String[] args) {

        double pi = Math.PI;
        //1º    
        char original = 'b';
        int code = (int) original;
        char recovered = (char) code;

        System.out.println(original);
        System.out.println(code);
        System.out.println(recovered);
        //2º
        char letter1 = 'c';
        letter1++;

        System.out.println(letter1);

        //3º
        final int numberOfLetters = 'z' - 'a' + 1;
        final char[] letters = new char[numberOfLetters];
        for (int i = 0; i != letters.length; i++) {
            letters[i] = (char) ('a' + i);
        }

        System.out.println(letters);

        //4º
        int number = 3;
        increment(number);
        System.out.println(number);
        
        int[]numbers={1,2,3,4};
        incrementFirstof(numbers);
    System.out.println(Arrays.toString(numbers));
    for(int i =0; i<numbers.length; i++){
        System.out.println(Arrays.toString(numbers));
    }
    }
    
}
