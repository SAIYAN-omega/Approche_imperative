package fr.algorithmie;


import java.util.Scanner;

public class InteractifFibonnaci
{
    public static void main(String[] args)
    {
        Scanner Saisie = new Scanner(System.in);
        int nombre = Saisie.nextInt();
        int Somme1 = 1;
        int Somme2 = 0;
        int Somme = 0;


        for (int i = 0; i < nombre - 1; i++)
        {
            Somme = Somme1 + Somme2;
            Somme2 = Somme1;
            Somme1 = Somme;

            System.out.println("F" + (i + 2) + " : " + Somme1);
        }
        System.out.println("------------------------------------");
        System.err.println("F" + nombre + " : " + Somme1); // pour mettre en avant ce n'est pas une erreur !!!

    }
}


