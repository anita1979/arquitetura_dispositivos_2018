/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Anita Pereira
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Word");
        // Invocar função para calcular o perímetro
        double perimetro = RectanguloPerimetro(2, 4);
        System.out.println("O perímetro é: " + perimetro);
        //Invocar função para o volume
        double volume = VolumeParalelepipedo(5, 5, 5);
        System.out.println("O volume é : " + volume);
        //Invocar função temperatura
        double temperatura = GrausFarenheit(5);
        System.out.println(" A temperatura é : " + temperatura);
        //Invocar função intervalo temporal
        double intervalo = IntervaloTemporal(6, 30);
        System.out.println("O valor em segundos é " + intervalo);
        // Criar array
        int[] array = {1, 3, 47, 5, 6, 7};
        //Invocar função calcular maximo como array
        int max = ArrayMax(array);
        System.out.println("O máximo é:" + max);
        
        //Invocar função calcular minimo como array
        int min = ArrayMin(array);
        System.out.println("O minimo é:" + min);
        //Invocar função calcular media como array
        int med = ArrayMed(array);
        System.out.println("A média é:" + med);
    }

    public static double RectanguloPerimetro(int ladoA, int ladoB) {
        double perimetro = 0;
        perimetro = ladoA + ladoB + ladoA + ladoB;
        return perimetro;
    }

    private static double VolumeParalelepipedo(int comprimento, int largura, int altura) {
        double volume = 0;
        volume = comprimento * largura * altura;
        return volume;
    }

    private static double GrausFarenheit(double temperatura) {
        temperatura = (temperatura - 32) * (5.0 / 9.0);
        return temperatura;
    }

    private static double IntervaloTemporal(int horas, int minutos) {
        double intervalo = (horas * 60) + (minutos * 60);
        return intervalo;
    }

    private static int ArrayMax(int[] array) {
        int max = 0;
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            if (aux > max) {
                max = aux;
            }
        }
        return max;
    }
     private static int ArrayMin(int[] array) {
        int min = 50;
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            if (aux <= min) {
                min = aux;
            }
        }
        return min;
    }

    private static int ArrayMed(int[] array) {
        int med = 50;
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            aux = array [i]+ array[i];
            if (aux > med) {
                med = aux;
            }
        }
        return med;
    }
}
