package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique
{
    public static void main(String[] args)
    {
        Scanner Saisie = new Scanner(System.in);
        int Nombre = Saisie.nextInt();
        int Somme = 0;

        for (int i = 1; i < Nombre + 1; i++)
        {
            Somme = Somme + i;
        }
        System.out.println(Somme);
    }
}
