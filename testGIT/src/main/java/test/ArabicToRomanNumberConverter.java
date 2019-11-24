package test;

public class ArabicToRomanNumberConverter {


    public String Convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if(noNumber) {
            return getDefaultRomanNumber();
        }
        if(arabicNumber == 1){
            return "I";
        }
        else{
            return "II";
        }

    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
