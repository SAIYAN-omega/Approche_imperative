package fr.algorithmie;

public class FirstLast
{
    public static void main(String[] args)
    {
        int[] TableauxEntier = {0,6};
        Boolean Bouler = false;

        for (int i = 0; i < TableauxEntier.length; i++)
        {
            if((TableauxEntier.length >= 1) && ((TableauxEntier[0] == 6) || (TableauxEntier[TableauxEntier.length - 1] == 6)))
            {
                Bouler = true;
            }
            else
            {
                Bouler = false;
            }
        }
        System.out.println(Bouler);
    }
}
