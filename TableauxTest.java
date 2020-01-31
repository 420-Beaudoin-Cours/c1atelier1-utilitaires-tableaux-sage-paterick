import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Créer par Patrick Provost le 31 janvier 2020
 * Dernières modifications le 31 janvier 2020
 */

public class TableauxTest {

    @Test
    public void trierCroissantSSS() {
        int[] tab = {2, 7, 1, 9, 4};
        int[] expectedTab = {1, 2, 4, 7, 9};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @Test
    public void trierDecroissantSSS() {
        int[] tab = {2, 7, 1, 9, 4};
        int[] expectedTab = {9, 7, 4, 2, 1};
        Tableaux.trierDecroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @Test
    public void maximum() {
        int[] tab = {2, 7, 1, 9, 4};
        int expectedResult = 9;
        int result = Tableaux.maximum(tab);
        assertEquals(expectedResult, result);
    }

    @Test
    public void minimum() {
        int[] tab = {2, 7, 1, 9, 4};
        int expectedResult = 1;
        int result = Tableaux.minimum(tab);
        assertEquals(expectedResult, result);
    }

    @Test
    public void moyenne() {
        int[] tab = {2, 7, 1, 6, 4};
        double expectedResult = 4.0;
        double result = Tableaux.moyenne(tab);
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void fouilleSeq() {
        int[] tab = {2, 7, 1, 9, 4};
        int cherche = 7;
        boolean expectedResult = true;
        boolean result = Tableaux.fouilleSeq(tab, cherche) > -1;
        assertEquals(expectedResult, result);
    }
}