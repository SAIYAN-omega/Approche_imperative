package fr.tableaux;

public class ExerciceDeclarationTab
{
    public static void main(String[] args)
    {
        int[] chiffre = {8,-7,12,1,-2,14,17,9};
        System.out.println(chiffre[0]);
        System.out.println(chiffre.length);
        System.out.println(chiffre[chiffre.length - 1]);
        //System.out.println(chiffre[10]); cela ne marche pas car on depasse la taille total du tableaux :(

    }
}
