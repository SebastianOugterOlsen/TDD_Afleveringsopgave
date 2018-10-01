package sebastianougter;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/*
Kan ikke få oprettet et rigtigt test modul.
 */

class DivisionsTest {




    /*
    Kan ikke få det til at virke
     */

    @Test
    void testTenDividedByTwoEqualsFive() {
        //a = 10, b = 2 => result = 5

        //3. Arrange/set-up ( Hvilke variabler/instantieringer skal vi bruge til vores metode.)
        int a = 10;
        int b = 2;

        Division division = new Division();

        //2. Act/Execution (Hvilke metode skal der bruges for at få vores resultat)
        int result = division.divide(a, b);

        //1. Assert/Verification ( Hvilket resultat vil vi gerne have )
        // Hvad skal der ske

        assertEquals(5, result);

        //4. Clean-up

    }


}