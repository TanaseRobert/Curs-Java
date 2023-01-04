package Curs;

import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {

        // String = sir de caractere delimitate de ' '
        String marca = "BMW";
        String model = "Series 5";

        // Integer = numar intreg
        int an = 2016;
        int motor = 1995;

        // Float/Double = numar zecimal
        float pret = 17.8f;
        double valoare = 17.8;

        // Boolean = adevarat sau fals (cu minuscula)
        boolean inmatriculata = false;

        // Char = un singur caracter
        char clasa = 'D';

        // dimensiunea unui sir
        System.out.println(marca.length());

        // scriere cu majuscule
        System.out.println(model.toUpperCase());

        // scriere cu minuscule
        System.out.println(model.toLowerCase());

    }
}
