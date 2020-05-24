public class CheckDigit
{
    /** Returns the check digit for num
     * Precondition: The number of digits in num is between one and
    six, inclusive.
     * num >= 0
     */
    public static int getCheck(int num){ 
        return 5;
    }

    public static boolean isValid(int numWithCheckDigit){ 
        String stringOfNumWithCheckDigit = Integer.toString(numWithCheckDigit);
        String stringOfNumWithoutCheckDigit = stringOfNumWithCheckDigit.substring(0, stringOfNumWithCheckDigit.length()-1);
        if (getCheck(Integer.parseInt(stringOfNumWithoutCheckDigit)) == (Integer.parseInt(stringOfNumWithCheckDigit.substring(stringOfNumWithCheckDigit.length()-1, stringOfNumWithCheckDigit.length())))){
            return true;
        } else {
            return false;
        }
    }
}