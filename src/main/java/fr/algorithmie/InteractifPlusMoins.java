package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins
{
    public static void main(String[] args)
    {
        Random Tirage = new Random();
        Scanner Saisie = new Scanner(System.in);
        int Nombre = Tirage.nextInt(100 - 0) + 0;
        int Compteur = 0;
        int Reponse = 0;

        while(Reponse != Nombre)
        {
            Reponse = Saisie.nextInt();
            if(Reponse > Nombre)
            {
                System.out.println("vous etes trop haut");
            }
            else
            {
                System.out.println("vous etes trop bas");
            }
            Compteur++;
        }
        System.out.println("Bravo, vous avez trouvé en " + Compteur + " coups");
        System.out.println("voici le Nombre secret : " + Nombre);
    }
}
