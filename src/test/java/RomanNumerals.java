import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    void shouldReturnIasRomanNumeralforArabic1() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanOne = romanNumerals.convert(1);

        assertEquals("I", romanOne);
    }

    @Test
    void shouldReturnIIasRomanNumeralforArabic2() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanTwo = romanNumerals.convert(2);

        assertEquals("II", romanTwo);
    }

    @Test
    void shouldReturnIIIasRomanNumeralforArabic3() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanThree = romanNumerals.convert(3);

        assertEquals("III", romanThree);
    }

    @Test
    void shouldReturnXasRomanNumeralforArabic10() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanTen = romanNumerals.convert(10);

        assertEquals("X", romanTen);
    }

    @Test
    void shouldReturnXXasRomanNumeralforArabic20() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanTwenty = romanNumerals.convert(20);

        assertEquals("XX", romanTwenty);
    }
    @Test
    void shouldReturnXXXasRomanNumeralforArabic30() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanThirty = romanNumerals.convert(30);

        assertEquals("XXX", romanThirty);
    }

    @Test
    void shouldReturnVasRomanNumeralforArabic5() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanFive = romanNumerals.convert(5);

        assertEquals("V", romanFive);
    }
    @Test
    void shouldReturnVIasRomanNumeralforArabic6() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanSix = romanNumerals.convert(6);

        assertEquals("VI", romanSix);
    }
    @Test
    void shouldReturnIVasRomanNumeralforArabic4() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanFour = romanNumerals.convert(4);

        assertEquals("IV", romanFour);
    }
    @Test
    void shouldReturnIXasRomanNumeralforArabic9() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanNine = romanNumerals.convert(9);

        assertEquals("IX", romanNine);
    }
    @Test
    void shouldReturnXXIXasRomanNumeralforArabic29() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String romanTwentyNine = romanNumerals.convert(29);

        assertEquals("XXIX", romanTwentyNine);
    }

}
