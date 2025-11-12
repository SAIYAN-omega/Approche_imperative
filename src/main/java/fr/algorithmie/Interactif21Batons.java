package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons
{
    public static void main(String[] args) {
        Random TirageauSort = new Random();
        Scanner Saisie = new Scanner(System.in);
        int TotaleBatons = 21;
        int joueur = 0;
        int ordinateur = 0;
        int QuiCommence = TirageauSort.nextInt(3 - 1) + 1;
        boolean PartiFinie = false;
        boolean JoueurPerd = false;
        Boolean OrdiPerd = false;
        int[] MemoireCou = {0}; // 1 = joueur, 2 = Ordi

        switch (QuiCommence)
        {
            case 1:
                System.out.println("Baton restant : " + TotaleBatons);
                System.out.println("tu commence");
                while ((joueur < 1) || (joueur > 3))
                {
                    joueur = Saisie.nextInt();
                }
                TotaleBatons = TotaleBatons - joueur;
                MemoireCou[0] = 1;
                joueur = 0;
                break;
            case 2:
                System.out.println("c'est l'ordinateur qui commence");
                ordinateur = TirageauSort.nextInt(4 - 1) + 1;
                TotaleBatons = TotaleBatons - ordinateur;
                MemoireCou[0] = 2;
                break;
            default:
        }
        while (!PartiFinie)
        {
            if(TotaleBatons <= 3)
            {
                switch (TotaleBatons)
                {
                    case 3:
                        if(MemoireCou[0] != 1)
                        {
                            System.out.println("Batons restant :" + TotaleBatons);
                            while ((joueur < 1) || (joueur > 2))
                            {
                                joueur = Saisie.nextInt();
                            }
                            TotaleBatons = TotaleBatons - joueur;
                            MemoireCou[0] = 1;
                            joueur = 0;
                        }
                        else
                        {
                            ordinateur = TirageauSort.nextInt(3 - 1) + 1;
                            TotaleBatons = TotaleBatons - ordinateur;
                            MemoireCou[0] = 2;
                            System.out.println("ordo a retirer : " + ordinateur);
                        }
                        break;
                    case 2:
                        if(MemoireCou[0] != 1)
                        {
                            System.out.println("Batons restant :" + TotaleBatons);
                            while (joueur != 1)
                            {
                                joueur = Saisie.nextInt();
                            }
                            TotaleBatons = TotaleBatons - joueur;
                            MemoireCou[0] = 1;
                            joueur = 0;
                        }
                        else
                        {
                            ordinateur = 1;
                            TotaleBatons = TotaleBatons - ordinateur;
                            MemoireCou[0] = 2;
                            System.out.println("ordo a retirer : " + ordinateur);
                        }
                        break;
                    case 1:
                        if(MemoireCou[0] != 1)
                        {
                            System.out.println("Batons restant :" + TotaleBatons);
                            while (joueur != 1)
                            {
                                joueur = Saisie.nextInt();
                            }
                            TotaleBatons = TotaleBatons - joueur;
                            MemoireCou[0] = 1;
                            joueur = 0;
                            JoueurPerd = true;
                            PartiFinie = true;
                        }
                        else
                        {
                            ordinateur = 1;
                            TotaleBatons = TotaleBatons - ordinateur;
                            MemoireCou[0] = 2;
                            OrdiPerd = true;
                            PartiFinie = true;
                        }
                        break;
                    default:
                        break;
                }
            }
            else
            {
                if(MemoireCou[0] != 1)
                {
                    System.out.println("Batons restant :" + TotaleBatons);
                    while ((joueur < 1) || (joueur > 3))
                    {
                        joueur = Saisie.nextInt();
                    }
                    TotaleBatons = TotaleBatons - joueur;
                    MemoireCou[0] = 1;
                    joueur = 0;
                }
                else
                {
                    ordinateur = TirageauSort.nextInt(4 - 1) + 1;
                    TotaleBatons = TotaleBatons - ordinateur;
                    MemoireCou[0] = 2;
                    System.out.println("ordo a retirer : " + ordinateur);
                }
            }
        }
        if(JoueurPerd)
        {
            System.out.println("tu as perdus");
        }
        else
        {
            System.out.println("tu as gagner");
        }
    }
}