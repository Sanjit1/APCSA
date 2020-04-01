/*
 * Stuff here belongs to Hannes, uptil WU 21 which is mine
 */
import chn.util.*;
import apcslib.*;
import java.awt.*;
import java.util.Random;

public class WarmupMethods
{
    static Random rand = new Random();
    static ConsoleIO cons = new ConsoleIO();
    public void multTable(int size)
    {
        System.out.println("\nMultiplication table.");
        System.out.println();
        int numRow = size;
        int numColumn = size;

        for(int row = 1; row <= numRow; row++)                              
        {
            for(int column = 1; column <= numColumn; column++)             
            {
                {
                    System.out.print(Format.left(column * row, 3));       
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Star Plot
     * 10/30/2019
     */
    public static void starPlot(int n)
    {
        for(int line = 1; line <= n; line++)   // initializes line to 1 
        {
            int spaces = (n - line);            // algorithm to calculate spaces
            for(int loop = 1; loop <= spaces; loop++)// prints out spaces
                System.out.print (" ");           // print a blank space
            int stars = ((2 * line) - 1);       // algorithm for stars
            for(int loop = 1; loop <= stars; loop++)// prints out stars
                System.out.print("*");      // star
            System.out.println ();         // skip line
        }
        System.out.println();
    }

    /**
     * Color Wheel
     * 10/31/2019
     */
    public void colorWheel()
    {
        DrawingTool pen = new DrawingTool(new SketchPad(800, 800));       
        int myDirection = 90;

        for(int line = 0; line < 360; line++)
        {
            pen.setWidth(2);
            pen.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
            pen.turnRight(1);
            pen.forward(300);
            pen.move(0, 0);
            pen.setDirection(myDirection);
            myDirection--;
        }
        System.out.println();
    }

    /**
     * Making a Square
     * 11/1/2019
     */
    public void makeSquare(int size)
    {
        System.out.println("\n\tMaking a square.\n");
        System.out.print("\t");
        for(int row = 0; row < size; row++)
        {
            System.out.print("*  ");
        }
        System.out.println();

        for(int column = 0; column < size - 2; column++)
        {
            System.out.print("\t");
            System.out.print("*");
            for(int space = 0; space <= size - 3; space++)
            {
                System.out.print("   ");
            }
            System.out.println("  *");
        }

        System.out.print("\t");
        for(int row = 0; row < size; row++)
        {
            System.out.print("*  ");
        }
    }

    /**
     * Reverse String
     * 11/12/2019
     */
    public String reverseString(String str)
    {
        String reversedString = "";

        for(int count = 0; count < str.length(); count++)
        {
            reversedString += str.charAt(str.length() - 1 - count);
        }
        return reversedString;
    }

    /**
     * Finding First Vowel
     * 11/13/2019
     */
    public int findVowel(String word)
    {
        int vowelPos = -1;
        String vowels = "aeiouAEIOU";

        for(int count = 0; count < word.length(); count ++)
        {
            vowelPos = vowels.indexOf(word.charAt(count));
            if(vowelPos != -1)
            {
                return count;
            }
        }
        return vowelPos;
    }

    /**
     * Making a Right Triangle
     * 11/14/2019
     */
    public void makeRightTriangle(int side)
    {
        System.out.println("\n\tMaking a triangle." + "\n"); 
        if(side <= 0)
        {
            System.out.print(-1);
        }
        else
        {
            for(int count = 0; count < side; count++)
            {
                if(count == (side - 1))
                {
                    System.out.print("\t*");
                    for(int line = 1; line < side; line++)
                    {
                        System.out.print("    *");
                    }
                }
                else
                {
                    System.out.print("\t*");

                    for(int index = 0; index < count; index++)
                    {
                        System.out.print("     ");
                    }

                    if(count > 0)
                    {
                        System.out.println("*");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println();
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * Change the Capitalization of a Word
     * 11/15/2019
     */
    public String changeCapital(String word)
    {
        String reversedWord = "";

        if(word.charAt(0) == (word.toUpperCase().charAt(0)))
        {
            reversedWord = word.toLowerCase().charAt(0) + word.substring(1); 
        }
        else
        {
            reversedWord = word.toUpperCase().charAt(0) + word.substring(1);
        }
        return reversedWord;
    }

    /**
     * Reverse the Words in a String
     * 12/4/2019
     */
    public String reverseWords(String msg)
    {
        int endWord = msg.indexOf(" ");
        int startWord = 0;
        String word = "";

        if(msg.length() == 0)
        {
            word = msg;
        }
        else if(msg.indexOf(" ") == -1)
        {
            word = msg;
        }
        else
        {
            word += reverseWords(msg.substring(endWord + 1)) + " " + msg.substring(startWord, endWord);
        }

        return word.trim();
    }

    /**
     * Flip the Halves in a String
     * 12/10/2019
     */
    public String flipHalves(String msg)
    {
        int half;
        String firstHalf, secondHalf;

        half = msg.length() / 2;
        firstHalf = msg.substring(0, half);
        secondHalf = msg.substring(half);

        return secondHalf + firstHalf;
    }

    /**
     * Flip the Thirds in a String
     * 12/12/2019
     */
    public void flipThirds(String str)
    {   
        System.out.println("The third third is:" + str.substring((str.length() - (str.length() / 3))) + " The first third is: " + str.substring(0, str.length() / 3));
    }

    /**
     * Add Name to the end of String
     * 12/13/2019
     */
    public void addName(String str)
    {
        System.out.println(str + " Hannes Du");
    }

    /**
     * Find 'e' and Reverse String
     * 12/16/2019
     */
    public String stringFun(String str)
    {
        int eCount = 0;
        int firstE = str.indexOf('e');
        int lastE = 0;
        String reverseString = "";
        String eString = "";

        for(int count = firstE; count < str.length(); count++)
        {
            if(str.charAt(count) == 'e')
            {
                System.out.println("Letter e is at position " + count);
                eCount++;
                lastE = count;
            }
        }

        return eString = str.substring(firstE, lastE + 1);
    }

    /**
     * Print the List of an Array
     * 12/17/2019
     */
    public void printArray(int[] intArray)
    {
        for (int count = 0; count < intArray.length; count++)
        {
            if (count % 10 == 0)
            {
                System.out.print("\nNumbers in array: " + intArray[count]);
            }
            else
            {
                System.out.print("," + intArray[count]);
            }
        }
    }

    int sum = 0;    
    /**
     * Print the Sum of an Array
     * 12/18/2019
     */
    public int arraySum(int[] intArray2)
    {
        for(int count = 0; count < intArray2.length; count++)
        {
            sum += intArray2[count];
        }
        return sum;
    }

    /**
     * Print the Average of an Array
     * 12/18/2019
     */
    public double arrayAverage(int[] intArray2)
    {
        return (double) sum / (double) intArray2.length;
    }

    /**
     * Print the Frequency of an Array
     * 12/19/2019
     */
    public void freqArray(int[] intArray3)
    {
        int[] freqArray = new int[10];

        for (int count = 0; count < intArray3.length; count++)
        {
            freqArray[intArray3[count]]++;
        }

        printArray(freqArray);
    }

    /**
     * Print the Largest Number in the Array
     * 12/20/2019
     */
    public int largestInArray(int[] intArray)
    {
        int greatest = 0;

        for(int count = 0; count < intArray.length; count++)
        {
            if(intArray[count] > greatest)
            {
                greatest = intArray[count];
            }
        }

        return greatest;
    }

    /**
     * Print the Smallest Number in the Array
     * 12/20/2019
     */
    public int leastInArray(int[] intArray)
    {
        int least = 0;

        for(int count = 0; count < intArray.length; count++)
        {
            if(intArray[count] < least)
            {
                least = intArray[count];
            }
        }

        return least;
    }

    /**
     * Swap the Positions of Two Integer Index Points
     * 1/7/2020
     */
    public void swapPositions(int[] array, int index1, int index2)
    {
        int i = array[index1];
        System.out.println("Output:");
        printArray(array);

        array[index1] = array[index2];
        array[index2] = i;

        printArray(array);
    }

    /**
     * Check for Neighbors
     * 1/9/2020
     */
    public int checkForNeighbors(int[][] neighbor, int xPos, int yPos)
    {
        int neighborCount = 0;

        for (int row = -1; row <= 1; row++)
        {
            for (int col = -1; col <= 1; col++)
            {
                if (col == 0 && row == 0)
                {
                    neighborCount += 0;
                }
                else if (neighbor[xPos + row][yPos + col] == 1)
                {
                    neighborCount++;
                }
            }
        }
        return neighborCount;
    }

    /**
     * Dunlea's Answer
     */
    public int checkNeighbors(int[][]myMatrix, int cellRow, int cellCol)
    {
        int neighbors = 0;

        for (int row = cellRow - 1; row < cellRow + 2; row++)
        {
            for (int col = cellCol - 1; col < cellCol + 2; col++)
            {
                neighbors = neighbors + myMatrix[row][col];
            }
        }
        if (myMatrix[cellRow][cellCol] == 1)
        {
            neighbors = neighbors - 1;
        }
        return neighbors;
    }

    /**
     * Guessing Game
     * 2/5/2020
     */
    public void guessingGame(){
        System.out.println("Do you want to play the guessing game?");
        if("yes".equals(cons.readToken().toLowerCase())){
            boolean guessed = false;
            int lowBound = 0;
            int highBound = 1024;
            int guesses = 0;
            while(!guessed){
                guesses++;
                int myGuess = lowBound + rand.nextInt(highBound-lowBound+1);
                System.out.println("I guessed " + myGuess);
                System.out.println("Am I correct?");
                String guessTruth = cons.readToken().toLowerCase();
                if("yes".equals(guessTruth)){
                    guessed  = true;
                } else if("high".equals(guessTruth)){
                    highBound = myGuess - 1;
                } else if("low".equals(guessTruth)){
                    lowBound = myGuess + 1;
                }
            }
            System.out.println("I guessed your number in "+ guesses + " turns");
        } else {
            System.out.println("Guessing game done");
        }
    }
    public int[] mergeIt(int[] a1, int[] a2){
        int[] a3 = new int[a1.length+a2.length];
        boolean notDone = false;
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while(notDone){
            if(a1[index1]<a2[index2]){
                a3[index3] = a1[index1];
                index1++;
                index3++;
            }
            else if(a1[index1]>a2[index2]){
                a3[index3] = a2[index2];
                index2++;
                index3++;
            }
            else if(a1[index1]==a2[index2]){
                a3[index3] = a1[index1];
                a3[index3+1] = a2[index1];
                index1++;
                index2++;
                index3+=2;
            }
            if(index1==a1.length&&index2<a2.length){
                for (int i = index3; i< a2.length;i++){
                    a3[i] = a2[index2];
                    index2++;
                }
                notDone=false;
            }
            if(index2==a2.length&&index1<a1.length){
                for (int i = index3; i< a1.length;i++){
                    a3[i] = a1[index1];
                    index1++;
                }
                notDone=false;
            }
            if (index2==a2.length&&index3==a3.length){
                notDone=false;
            }
        }
        return a3;
    }
    public int[] dunleaMerge(int[] a1, int[] a2){
        int[] toReturn = new int[a1.length+a2.length];
        int index3 = 0;
        int index1 = 0;
        int index2 = 0;
        while (index3 < toReturn.length){
            if((index2 == a2.length) || ((index1 != a1.length) && (a1[index1] <= a2[index2]))){
                toReturn[index3] = a1[index1++];
            }
            else{
                toReturn[index3] = a2[index2++];
            }
            index3++;
        }
        return toReturn;
    }
}