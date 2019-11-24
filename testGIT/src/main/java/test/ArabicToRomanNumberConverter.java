package test;

public class ArabicToRomanNumberConverter {

    public void add(){
        return;
    }


    public String Convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if(noNumber) {
            return getDefaultRomanNumber();
        }
        String romanNumber = "";
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
