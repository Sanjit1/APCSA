import chn.util.*;
import apcslib.Format;
import java.util.*;

/**
 *  Driver program for the Sorts class.
 *
 * @author     G. Peck
 * @created    July 18, 2002
 */
public class SortStepGenerateChart
{
    private ConsoleIO console;
    private int[] myArray;
    private Sorts mySorts;

    /**
     *  Constructor for the SortStep object
     */
    public SortStepGenerateChart()
    {
        console = new ConsoleIO();
        mySorts = new Sorts();
        System.out.println("\u000C");
    }

    /**
     *  Asks the user to select a sorting algorithm, fills the array
     *  with an amount of random integer data chosen by the user, calls
     *  the sorting algorithm, and gives an option of printing out the
     *  data after it has been sorted.
     */
    public void sortMenu()
    {
        String choice;
        String print;
        do
        {
            System.out.println("Sorting algorithm menu");
            System.out.println("(1) Bubble sort");
            System.out.println("(2) Selection sort");
            System.out.println("(3) Insertion sort");
            System.out.println("(4) Recursive mergesort");
            System.out.println("(5) Quicksort");
            System.out.println("(Q) Quit");
            System.out.println();
            System.out.print("Choice ---> ");
            choice = console.readLine() + " ";
            if ('1' <= choice.charAt(0) && choice.charAt(0) <= '5')
            {
                System.out.println();
                System.out.print("Largest List to generate? ");
                int largestList = console.readInt();
                System.out.print("How much do you wish to step by? ");
                int stepSize = console.readInt();
                System.out.print("How many samples do you wish to generate? ");
                int sampleInts = console.readInt();
                System.out.print("Largest integer to generate? ");
                int largestInt = console.readInt();
                System.out.print("Print all lists to screen (y/n)? ");
                print = console.readLine();
                ArrayList<Integer>[] chart = new ArrayList[2];
                chart[0] = new ArrayList<Integer>();
                chart[1] = new ArrayList<Integer>();
                for (int numInts = stepSize; numInts < largestList+1; numInts += stepSize){
                fillArray(numInts, largestInt);
                    long total = 0;
                    for (int i = 0; i < sampleInts; i++){
                        mySorts.setStepCount(0);
                        switch (choice.charAt(0))
                        {
                            case '1':
                            mySorts.bubbleSort(myArray);
                            break;
                            case '2':
                            mySorts.selectionSort(myArray);
                            break;
                            case '3':
                            mySorts.insertionSort(myArray);
                            break;
                            case '4':
                            mySorts.mergeSort(myArray, 0, myArray.length - 1);
                            break;
                            case '5':
                            mySorts.quickSort(myArray, 0, myArray.length - 1);
                            break;
                        }
                        if (print.charAt(0) == 'y' || print.charAt(0) == 'Y')
                        {
                            System.out.println();
                            screenOutput();
                        }
                        total+= mySorts.getStepCount();
                    }
                    long average = total/((long)sampleInts);
                    chart[0].add(numInts);
                    chart[1].add((int)average);
                }
                doSomethingWithChart(chart);
                System.out.print("Hit return to continue");
                console.readLine();
            }
        } while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
    }
        
    public void doSomethingWithChart (ArrayList<Integer>[] chart) {
        System.out.println("Integer : AvgSteps");
        for (int i = 0; i< chart[0].size(); i++) {
            System.out.println(chart[0].get(i) + " : " + chart[1].get(i));
        }
    }

    /**
     *  Initializes myArray with random integers in the range
     *  1..largestInt
     *
     * @param  numInts     number of integers to generate (size of
     *      myArray)
     * @param  largestInt  largest possible random integer to create
     */

    private void fillArray(int numInts, int largestInt)
    {
        myArray = new int[numInts];
        Random randGen = new Random();

        for (int loop = 0; loop < myArray.length; loop++)
        {
            myArray[loop] = randGen.nextInt(largestInt) + 1;
        }
    }

    /**
     *  prints out the contents of the array in tabular form, 12 columns
     */
    private void screenOutput()
    {
        for (int loop = 0; loop < myArray.length; loop++)
        {
            if (loop % 12 == 0)
            {
                System.out.println();
            }
            System.out.print(Format.right(myArray[loop], 6));
        }
        System.out.println();
    }

    /**
     *  Provides a main method for access to the sorting menu
     *
     * @param  args  The command line arguments (not used)
     */
    public static void main(String[] args)
    {
        SortStepGenerateChart doSorts = new SortStepGenerateChart();

        doSorts.sortMenu();
    }
}
