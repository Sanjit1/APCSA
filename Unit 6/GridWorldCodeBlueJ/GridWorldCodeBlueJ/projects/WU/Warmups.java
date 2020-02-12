/*
 * Stuff here belongs to Hannes, uptil WU 21 which is mine
 */
import chn.util.*;
import apcslib.*;
import java.awt.*;
import java.util.Random;

public class Warmups
{
    public static void main(String[] args){
        WarmupMethods warmup = new WarmupMethods();
        ConsoleIO input = new ConsoleIO();
        int[] intArray = {0,6,13,0,0,76,33,0,0,0,4,29,21,0,86,0,32,66,0,0};
        int[] intArray2 = {6,13,76,33,4,29,21,86,32,66};
        int[] intArray3 = {1,0,4,5,3,2,3,2,5,6,4,6,7,5,4,3,3,5,5,2,5,6,6,5,5,7,8,9,6,8};
        int[] intArray4 = {3, 5, 2, 34, 23, 9};
        int[][] bioMatrix = {{0,0,0,0},
                {1,0,1,1},
                {1,1,1,1},
                {0,1,1,0}};

        final int MULTTABLE = 1;
        final int STARPLOT = 2;
        final int COLORWHEEL = 3;
        final int MAKESQUARE = 4;
        final int REVERSESTRING = 5;
        final int FINDVOWEL = 6;
        final int RIGHTTRIANGLE = 7;
        final int CHANGECAPITAL = 8;
        final int REVERSEWORDS = 9;
        final int FLIPHALVES = 10;
        final int FLIPTHIRDS = 11;
        final int ADDNAME = 12;
        final int STRINGFUN = 13;
        final int PRINTARRAY = 14;
        final int ARRAYAVERAGE = 15;
        final int FREQARRAY = 16;
        final int LARGESTINARRAY = 17;
        final int LEASTINARRAY = 18;
        final int SWAPNUMBERS = 19;
        final int CHECKNEIGHBORS = 20;
        final int GUESSINGGAME = 21;

        boolean done;
        double aLeg, bLeg;
        String str;
        int warmupNumber;

        done = false;
        while(!done)
        {
            System.out.print("\nDo you wish to continue doing warmups? ");
            str = input.readToken();

            if(str.charAt(0) == 'y' || str.charAt(0) == 'Y')
            {
                System.out.println("\n\t1 - Multiplication Table");
                System.out.println("\n\t2 - Star Plot");
                System.out.println("\n\t3 - Color Wheel");
                System.out.println("\n\t4 - Square");
                System.out.println("\n\t5 - Reverse String");
                System.out.println("\n\t6 - Find First Vowel");
                System.out.println("\n\t7 - Make a Right Triangle");
                System.out.println("\n\t8 - Change the Capitalization of a Word");
                System.out.println("\n\t9 - Reverse the Words in a String");
                System.out.println("\n\t10 - Flip the Halves in a String");
                System.out.println("\n\t11 - Flip the Thirds in a String");
                System.out.println("\n\t12 - Add Name to String");
                System.out.println("\n\t13 - Find Position of E");
                System.out.println("\n\t14 - Print an Array");
                System.out.println("\n\t15 - Print the Average of an Array");
                System.out.println("\n\t16 - Print the Frequency of an Array");
                System.out.println("\n\t17 - Print the Largest Number in an Array");
                System.out.println("\n\t18 - Print the Smallest Number in an Array");
                System.out.println("\n\t19 - Swap the Numbers in an Array");
                System.out.println("\n\t20 - Check for Neighbors");
                System.out.println("\n\t21 - Guessing Game");

                System.out.print("\nWhich warmup would you like to do? ");

                warmupNumber = input.readInt();

                switch(warmupNumber)
                {
                    case MULTTABLE:
                    System.out.println("\nToday's warmup is a multiplication table ");
                    System.out.print("What is the square size of the table you want? ");                           
                    warmup.multTable(input.readInt());
                    break;
                    case STARPLOT:
                    System.out.println("\nToday's warmup is a star plot ");
                    System.out.print("What is the size of the star plot you want? ");   
                    warmup.starPlot(input.readInt());
                    break;
                    case COLORWHEEL:
                    System.out.println("\nToday's warmup is a color wheel ");
                    warmup.colorWheel();
                    break;
                    case MAKESQUARE:
                    System.out.println("\nToday's warmup is making a square ");
                    System.out.print("How big should the square be? ");                           
                    warmup.makeSquare(input.readInt());
                    break;
                    case REVERSESTRING:
                    System.out.println("\nToday's warmup is reversing a string ");
                    System.out.print("Enter a string: ");
                    System.out.println("The word reversed is: " + warmup.reverseString(input.readToken()));
                    break;
                    case FINDVOWEL:
                    System.out.println("\nToday's warmup is finding the first vowel in a word ");
                    System.out.print("What word should I find vowels position? ");
                    int pos = warmup.findVowel(input.readToken());
                    if(pos == -1)
                    {
                        System.out.println("\nNo vowel was found!");
                    }
                    else
                    {
                        System.out.println("\nVowel position was " + pos);
                    }
                    break;
                    case RIGHTTRIANGLE:
                    System.out.println("\nToday's warmup is making a right triangle" );
                    System.out.print("\nEnter a side length: ");
                    warmup.makeRightTriangle(input.readInt());
                    break;
                    case CHANGECAPITAL:
                    System.out.println("\nToday's warmup is changing the capitalization of the first letter in a word ");
                    System.out.print("Put in a word to change first letter's capitalization: ");
                    System.out.print(warmup.changeCapital(input.readToken()));
                    break;
                    case REVERSEWORDS:
                    System.out.println("\nToday's warmup is reversing the words in a string");
                    System.out.print("Put in a sentence to reverse: ");
                    System.out.print("Words reversed --> " + warmup.reverseWords(input.readLine()));
                    break;
                    case FLIPHALVES:
                    System.out.println("\nToday's warmup is flipping the halves in a string");
                    System.out.print("What is your string input? ");
                    System.out.print("\nThe string output is: " + warmup.flipHalves(input.readLine()));
                    break;
                    case FLIPTHIRDS:
                    System.out.println("\nToday's warmup is flipping the thirds in a string");
                    System.out.print("What is your string input? ");
                    warmup.flipThirds(input.readLine());
                    break;
                    case ADDNAME:
                    System.out.println("\nToday's warmup is adding your name to the end of a strong.");
                    System.out.print("What is you string input? ");
                    warmup.addName(input.readLine());
                    break;
                    case STRINGFUN:
                    System.out.println("\nToday's warmup is locating the positions of 'e'");
                    System.out.print("What is your string input?" );
                    System.out.print("\nThe reverse string output is: " + warmup.reverseString(warmup.stringFun(input.readLine())));
                    break;
                    case PRINTARRAY:
                    System.out.println("\nToday's warmup is printing an array.");
                    warmup.printArray(intArray);
                    break;
                    case ARRAYAVERAGE:
                    System.out.println("\nToday's warmup is printing the average of an array.");
                    warmup.printArray(intArray2);
                    System.out.println("\nSum of array is: " + warmup.arraySum(intArray2));
                    System.out.println("Average of array is: " + warmup.arrayAverage(intArray2));
                    break;
                    case FREQARRAY:
                    System.out.println("\nToday's warmup is printing the frequency of an array.");
                    System.out.println("\nHere is the input array");
                    warmup.printArray(intArray3);
                    System.out.println("\n\nHere is the frequency array");
                    warmup.freqArray(intArray3);
                    break;
                    case LARGESTINARRAY:
                    System.out.println("\nToday's warmup is printing the largest number in an array.");
                    System.out.println("\nThe largest number is: " + warmup.largestInArray(intArray));
                    break;
                    case LEASTINARRAY:    
                    System.out.println("\nThe smallest number is: " + warmup.leastInArray(intArray));
                    break;
                    case SWAPNUMBERS:
                    System.out.println("\nToday's warmup is swapping the positions in an array.");
                    warmup.swapPositions(intArray4, 1, 3);
                    break;
                    case CHECKNEIGHBORS:
                    int neighbor = warmup.checkForNeighbors(bioMatrix, 2, 2);
                    System.out.println("\nNumber of Neighbors in matrix = " + neighbor);
                    System.out.println("\nCheck for Neighbors method is done");
                    break;
                    case GUESSINGGAME:
                    warmup.guessingGame();
                    break;
                    default:
                    System.out.println("You did not correctly choose a warmup\n");
                    break;
                }
            }
            else 
            {
                done = true;
            }            
        }
    }
}
