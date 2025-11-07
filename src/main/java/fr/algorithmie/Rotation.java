package fr.algorithmie;

public class Rotation
{
    public static void main(String[] args)
    {
        int[] TableauxEntier = {0,1,2,3,2,3,6,9,8};
        int ValeurStoker = TableauxEntier.length - 1;

        for (int i = 1; i < TableauxEntier.length; i++)
        {
            TableauxEntier[TableauxEntier.length - i] = TableauxEntier[TableauxEntier.length - (1 + i)];
        }
        TableauxEntier[0] = ValeurStoker;

        System.out.print('{');
        for (int i = 0; i < TableauxEntier.length; i++)
        {
            System.out.print(TableauxEntier[i] + ",");
        }
        System.out.print('}');
    }
}
