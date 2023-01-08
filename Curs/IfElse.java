package Curs;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        // Input de la tastatura
        System.out.println("Introduceti un numar: ");
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();

        if (numar % 2 == 0)
        {
            System.out.println("Numarul este par");
        }
        else System.out.println("Numarul este impar");

        if (numar > 0)
        {
            System.out.println("Numarul este pozitiv");
        }
        else if (numar == 0)
        {
            System.out.println("Numarul este nul");
        }
        else System.out.println("Numarul este negativ");

        System.out.println("Introduceti treapta de viteza: ");
        int viteza = sc.nextInt();
        switch (viteza)
        {
            case 1:
                System.out.println("0 - 20 km/h");
                break;
            case 2:
                System.out.println("20 - 40 km/h");
                break;
            case 3:
                System.out.println("40 - 60 km/h");
                break;
            case 4:
                System.out.println("60 - 80 km/h");
                break;
            case 5:
                System.out.println("80 - 100 km/h");
                break;
            case 6:
                System.out.println("100 - 130 km/h");
                break;
            default:
                System.out.println("Viteza invalida");
        }

    }
}
