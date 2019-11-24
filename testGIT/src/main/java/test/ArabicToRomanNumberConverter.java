package test;

public class ArabicToRomanNumberConverter {

    public void add(){
        return;
    }


    public String Convert(int arabicNumber) {
        int i  = 0;

        boolean noNumber = arabicNumber == 0;
        if(noNumber) {
            return getDefaultRomanNumber();
        }
        return getRepeatingRomanNumber(arabicNumber);
    }

    private String getRepeatingRomanNumber(int arabicNumber) {
        String romanNumber = "";



        while( arabicNumber >= 5 ) {
            romanNumber += "V";
            arabicNumber -= 5;
        }
        while( arabicNumber >= 1 ) {
            romanNumber += "I";
            arabicNumber -- ;
        }
        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
