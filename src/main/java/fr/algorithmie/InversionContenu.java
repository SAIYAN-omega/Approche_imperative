package fr.algorithmie;

public class InversionContenu
{
    public static void main(String[] args)
    {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopie = new int[array.length];
        System.out.print("arrayCopi : ");
        for (int i = 0; i < array.length; i++)
        {
            arrayCopie[i] = array[array.length - 1 - i];
            System.out.print(arrayCopie[i] + " ");


        }
        System.out.println('\n');
        System.out.print("array : ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}
