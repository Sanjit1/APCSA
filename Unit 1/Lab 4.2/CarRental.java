import chn.util.*;

public class CarRental
{
    static ConsoleIO console = new ConsoleIO();
    static String CarPlateLetters;
    static int CarPlateNumber;
    public static void main(String args[]){
        CarPlateLetters = console.readLine();
        CarPlateNumber = console.readInt();
        int sumOfLetters = CarPlateLetters.charAt(0) + CarPlateLetters.charAt(1) + CarPlateLetters.charAt(2);
        int sumOfAllChars = sumOfLetters + CarPlateNumber;
        int offset = sumOfAllChars % 26;
        char letter = (char)(offset + 'A');
        String output = letter+ Integer.toString(sumOfAllChars);
        System.out.println("Make = Chevrolet");
        System.out.println("Model = Suburban");
        System.out.println("Car Plate = " + CarPlateLetters + Integer.toString(CarPlateNumber));
        System.out.println("ID = " + output);
        
    }
}