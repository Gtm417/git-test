package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConvertArabianNumberToRoman {

    @Test
    public void Conver_0_To_EmptyString(){
        ArabicToRomanNumberConverter arabicToRomanNumberConverter = new ArabicToRomanNumberConverter();
        String romanNumber = arabicToRomanNumberConverter.Convert(0);
        assertEquals("",romanNumber);
    }

    @Test
    public void Conver_1_To_I(){
        ArabicToRomanNumberConverter arabicToRomanNumberConverter = new ArabicToRomanNumberConverter();
        String romanNumber = arabicToRomanNumberConverter.Convert(1);
        assertEquals("I",romanNumber);
    }

}
