package fr.algorithmie;




public class FabriquerMur
{

    public boolean fabriquerMur(int NbSmall,int nbBig,int longueur,int[] Brique)
    {
        boolean resultat = false;
        int CalculeLongueur = 0;
        CalculeLongueur = NbSmall * Brique[0] + nbBig * Brique[1];
        if(CalculeLongueur == longueur)
        {
            resultat = true;
        }
        return resultat;
    }
    public void Verifier(int NbSmall,int nbBig,int longueur,int[] Brique)
    {
        boolean resultat = fabriquerMur(NbSmall,nbBig,longueur,Brique);
        if(resultat == false)
        {
            System.err.println("ce n'est pas possible désoler");
        }
        else
        {
            System.out.println("c'est possible");
        }
    }
    public static void main(String[] args)
    {
        int[] Brique = {1,5};
        FabriquerMur construireMur = new FabriquerMur();
        construireMur.Verifier(3,1,8,Brique);
        construireMur.Verifier(3,1,9,Brique);
        construireMur.Verifier(3,2,10,Brique);
        construireMur.Verifier(3,2,8,Brique);
        construireMur.Verifier(3,2,9,Brique);
        construireMur.Verifier(6,1,11,Brique);
        construireMur.Verifier(6,0,11,Brique);
        construireMur.Verifier(1,4,11,Brique);
        construireMur.Verifier(0,3,10,Brique);
        construireMur.Verifier(1,4,12,Brique);
        construireMur.Verifier(3,1,7,Brique);
        construireMur.Verifier(1,1,7,Brique);
    }
}


