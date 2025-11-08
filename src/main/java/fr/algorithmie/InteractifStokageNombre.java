package fr.algorithmie;

import java.util.Scanner;

public class InteractifStokageNombre
{
    public static void main(String[] args)
    {
        Scanner Saisie = new Scanner(System.in);
        int[] CoffreFort = new int[5];

        int reponse = 0;
        int Nombre = 0;

        while(reponse != 3)
        {
            System.out.println("Bienvenue dans la banque des nombres !!!");
            System.out.println("1 vouler vous ajouter un Nombre dans le coffre Fort ?");
            System.out.println("2 vouler vous afficher votre solde de nombre ?");
            System.out.println("3 Quitter");
            System.out.print("Votre choix : ");
            reponse = Saisie.nextInt();

            switch (reponse)
            {
                case 1:
                    System.out.println("quelle nombre je stokes dans le coffre fort ?");
                    System.out.print("votre choix : ");
                    Nombre = Saisie.nextInt();
                    if(CoffreFort[CoffreFort.length - 1] != 0)
                    {
                        int[] Sauvgarde = new int[CoffreFort.length];
                        for (int i = 0; i < Sauvgarde.length; i++)
                        {
                            Sauvgarde[i] = CoffreFort[i];
                        }
                        CoffreFort = new int[CoffreFort.length * 2];
                        for (int i = 0; i < Sauvgarde.length; i++)
                        {
                            CoffreFort[i] = Sauvgarde[i];
                        }
                    }
                    for (int i = 0; i < CoffreFort.length; i++)
                    {
                        if(CoffreFort[i] == 0)
                        {
                            CoffreFort[i] = Nombre;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("\nvoici votre Solde de nombre dans le coffre fort\n" + "{");
                    for (int i = 0; i < CoffreFort.length; i++)
                    {
                        System.out.print(CoffreFort[i] + ",");
                    }
                    System.out.println("}");
                    break;
                case 3:
                    System.out.println("au revoir a bientot :)");
                default:


            }
        }


    }
}
