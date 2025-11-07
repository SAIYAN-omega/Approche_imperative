package fr.algorithmie;

public class SommeDeTableauxDiff
{
    public static void main(String[] args)
    {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
        int[] SommeTableaux = new int[array.length];

        for (int i = 0; i < array2.length; i++)
        {
            SommeTableaux[i] = array[i] + array2[i];
            System.out.println(SommeTableaux[i]);
        }
        for (int i = 0; i < (array.length - array2.length); i++)
        {
            SommeTableaux[i + array2.length] = array[i + array2.length] + 0;
            System.out.println(SommeTableaux[i + array2.length]);
        }
    }
}
