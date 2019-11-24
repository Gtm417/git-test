package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConvertArabianNumberToRoman {

    private String convertToRoman(int arabicNumber) {
        ArabicToRomanNumberConverter arabicToRomanNumberConverter = new ArabicToRomanNumberConverter();
        return arabicToRomanNumberConverter.Convert(arabicNumber);
    }

    @Test
    public void Conver_0_To_EmptyString(){
        String romanNumber = convertToRoman(0);
        assertEquals("",romanNumber);
    }

    @Test
    public void Conver_1_To_I(){
        String romanNumber = convertToRoman(1);
        assertEquals("I",romanNumber);
    }


    @Test
    public void Conver_2_To_II(){
        String romanNumber = convertToRoman(2);
        assertEquals("II",romanNumber);
    }

    @Test
    public void Conver_3_To_II(){
        String romanNumber = convertToRoman(3);
        //assertEquals("III",romanNumber);
    }

}
