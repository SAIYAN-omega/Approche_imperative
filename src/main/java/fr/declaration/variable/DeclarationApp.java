package fr.declaration.variable;

public class DeclarationApp
{
    public static void main(String[] args)
    {
        byte a = 16;
        short b = -123;
        int c = 1000000;
        long d = 1000000000000L;
        float e = 1.23f;
        double f = 23.0000000000D;
        char g = 'e';
        boolean h = true;
        String i = "bonjour";
        System.out.println(i);

        String randimString = "voici le résultat d'un calcul : 1 + 5 = 6";
        System.out.println(randimString);
        randimString = "voici le résultat d'un calcul : \n1 + 5 = 6";
        System.out.println(randimString);
    }
}
