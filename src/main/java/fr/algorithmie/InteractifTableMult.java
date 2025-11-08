package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult
{
    public static void main(String[] args)
    {
        Scanner Saisie = new Scanner(System.in);
        int Nombre = Saisie.nextInt();

        while ((Nombre < 1) || (Nombre > 10))
        {
            Nombre = Saisie.nextInt();
        }

        for (int i = 0; i < 11; i++)
        {
            System.out.println(Nombre + " x " + i + " = " + (Nombre * i));
        }
    }
}

