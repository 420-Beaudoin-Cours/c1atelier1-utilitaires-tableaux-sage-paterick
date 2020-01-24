import java.sql.SQLOutput;

/**
 * @author France Beaudoin
 * Modifié par Patrick Provost le 24 janvier 2020
 */

public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(int[] tab){
        int imax;
        for (int i=0; i<tab.length-1; i++){
            imax = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] > tab[imax])
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void print(int[] tab){
        for (int i: tab){
            System.out.print(i + " ");
        }
    }

    public static int maximum(int[] tab){
        int imax = 0;
        for (int i=0; i<tab.length-1; i++){
            if (tab[i] > tab[imax])
                imax = i;
        }
        return tab[imax];
    }

    public static int minimum(int[] tab){
        int imin = 0;
        for (int i=0; i<tab.length-1; i++){
            if (tab[i] < tab[imin])
                imin = i;
        }
        return tab[imin];
    }

    public static double moyenne(int[] tab){
        int somme = 0;
        for (int i=0; i<tab.length-1; i++){
            somme += tab[i];
        }
        return somme / tab.length;
    }

    public static int fouilleSeq(int[] tab, int cherche){
        boolean trouve = false;
        int i = 0;
        while (i<tab.length && !trouve){
            if (tab[i] == cherche)
                trouve = true;
            else
                i++;
        }
        if (trouve)
            return i;
        else
            return -1;
    }
}
