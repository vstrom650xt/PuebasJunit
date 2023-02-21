import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscelaneaTest {

    @Test
    void suma() {

        Miscelanea miscelanea = new Miscelanea();

        assertEquals(73, miscelanea.suma(43, 30));
    }

    @Test
    void generaAleatorioEntre() {
// asi si
        for (int i = 0; i < 1000; i++) {
            assertTrue(Miscelanea.generaAleatorioEntre(11, 7) <= 11 && Miscelanea.generaAleatorioEntre(11, 7) >= 7);
        }
    }

    @Test
    void concatena() {
       Miscelanea miscelanea = new Miscelanea();

        assertEquals("gatopardo", miscelanea.concatena("gato", "pardo"));
    }

    @Test
    void getMayor() {
        Miscelanea m = new Miscelanea();
        assertEquals(11, m.getMayor(7, 11));

    }

    @Test
    void getMaximo() {
        Miscelanea m = new Miscelanea();
        int[] ar = {8, 9, 1, 10, 3, 13};
        assertEquals(13, m.getMaximo(ar));
    }

    @Test
    void getElemento() {


        try{

            Miscelanea m = new Miscelanea();
            int[] ar = {8, 9, 1, 10, 3, 13};

            assertEquals(3, m.getElemento(ar, 4));
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                int valor = ar[7];
            });

        }catch (Exception e){




        }
    }

    @Test
    void factorial() {
        assertEquals(24, Miscelanea.factorial(4));
    }

    @Test
    void esPrimo() {
        assertTrue(Miscelanea.esPrimo(12));


    }


    void esPrimo2() {
        assertTrue(Miscelanea.esPrimo(13));


    }
    @Test
    void areaCirculo() {
        assertEquals(Math.pow(4,
                2) * Math.PI, Miscelanea.areaCirculo(4));

    }

    @Test
    void areaTriangulo() {
        assertEquals(14, Miscelanea.areaTriangulo(4, 7));

    }

    @Test
    void areaCuadrado() {

        assertEquals(16, Miscelanea.areaCuadrado(4));


    }

    @Test
    void decimalABinario() {
        String a = Miscelanea.decimalABinario(13);
        assertEquals(1101, a);

    }
}