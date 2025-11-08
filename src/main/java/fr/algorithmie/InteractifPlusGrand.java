package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand
{
    public static void main(String[] args)
    {
        Scanner Saisie = new Scanner(System.in);
        int[] Memoire = new int[10];
        int[] Classement = new int[Memoire.length];
        Boolean Existant = false;
        int PlusGrand = 0;
        int PlusGrandClassement = 0;
        int Nombre = Saisie.nextInt();
        Memoire[0] = Nombre;
        PlusGrand = Nombre;
        PlusGrandClassement = Nombre;


        for (int i = 1; i < 10; i++)
        {
            Nombre = Saisie.nextInt();
            Memoire[i] = Nombre;
            //Classement[i] = Memoire[i];
            if(Memoire[i] > PlusGrand)
            {
                PlusGrand = Memoire[i];
                Classement[0] = PlusGrand;

            }
        }

        for (int j = 0; j < Classement.length; j++)
        {
            for (int i = 0; i < Memoire.length; i++)
            {
                if(Memoire[i] > PlusGrand)
                {
                    for (int k = 0; k < Classement.length; k++)
                    {
                        if((Memoire[i] != Classement[k]))
                        {
                            Existant = false;
                        }
                        else
                        {
                            Existant = true;
                            break;
                        }
                    }
                    if(Existant == false)
                    {
                        PlusGrand = Memoire[i];
                        Classement[j] = PlusGrand;
                    }
                    Existant = false;

                }
            }
            PlusGrand = 0;
        }
        System.out.println("Classement : ");
        for (int i = 0; i < Classement.length; i++)
        {
            System.out.println("#" + (i + 1) + " : " + Classement[i]);
        }
        //System.out.println(PlusGrand);

    }
}
