package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants
{
    public static void main(String[] args)
    {
        Scanner Saisie = new Scanner(System.in);
        int Nombre = Saisie.nextInt();

        for (int i = 1; i < 11; i++)
        {
            System.out.println(Nombre + i);
        }
    }
}
