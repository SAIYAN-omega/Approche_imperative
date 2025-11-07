package fr.algorithmie;

public class AffichageInverse
{
    public static void main(String[] args)
    {
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int[] arrayCopie = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            //System.out.println(array[i]);
            //System.out.println(array[array.length - 1 - i]);

            arrayCopie[i] = array[i];
            System.out.println(arrayCopie[i]);
        }
    }
}
