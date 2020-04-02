import java.util.*;
public class Sorts
{
    private long steps;

    Sorts()
    {
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(int[] list)
    {
        steps++;
        for (int outer = 0; outer < list.length - 1; outer++)
        {
            steps += 4;
            //  1 - boundary check of outer loop;
            //  2 - increment, outer++
            //  3 - initialization of inner loop
            for (int inner = 0; inner < list.length - outer - 1; inner++)
            {
                steps += 4;
                //  1 - boundary check of inner loop
                //  2 - increment, inner++
                //  3 - if comparison
                if (list[inner] > list[inner+1])
                {
                    int temp = list[inner];
                    list[inner] = list[inner + 1];
                    list[inner + 1] = temp;
                    steps += 3;    // swap of list[inner] & list[inner + 1]
                }
            }
        }
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(int[] list)
    { 
        int n = list.length; 
        steps++;
        for (int i = 0; i < n-1; i++) 
        { 
            steps+=4;
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) {
                steps+=3;
                if (list[j] < list[min_idx]){
                    min_idx = j; 
                    steps+=2;
                }
            }

            // Swap the found minimum element with the first 
            // element
            int temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
        } 
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(int[] list)
    {
        steps++;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int j = i - 1;
            steps+=3;
            while (j >= 0 && list[j] > key) {
                steps+=3;
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    /**
     *  Takes in entire vector, but will merge the following sections
     *  together:  Left sublist from a[first]..a[mid], right sublist from
     *  a[mid+1]..a[last].  Precondition:  each sublist is already in
     *  ascending order
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  mid    midpoint index of range of values to be sorted
     * @param  last   last index of range of values to be sorted
     */
    private void merge(int[] a, int first, int mid, int last)
    {// Creating temporary subarrays
        int leftArray[] = new int[mid - first + 1];
        int rightArray[] = new int[last - mid];

        steps+=3;
        for (int i = 0; i < leftArray.length; i++){
            steps++;
            leftArray[i] = a[first + i];
        }
        steps+=3;
        for (int i = 0; i < rightArray.length; i++){
            steps++;
            rightArray[i] = a[mid + i + 1];
        }

        // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        steps+=3;
        for (int i = first; i < last + 1; i++) {
            steps+=4;
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                steps+=2;
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    a[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    a[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                a[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                a[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    /**
     *  Recursive mergesort of an array of integers
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void mergeSort(int[] a, int first, int last)
    {
        if (last <= first) return;
        steps+=3;
        int mid = (first+last)/2;
        mergeSort(a, first, mid);
        mergeSort(a, mid+1, last);
        merge(a, first, mid, last);
    }

    /**
     *  Recursive quicksort of an array of integers
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void quickSort(int[] a, int first, int last)
    {
        steps++;
        if (last <= first) return;
        int pivot = a[last];  
        int i = first-1; // index of smaller element
        for (int j=first; j<last; j++) 
        { 
            steps+=2;
            // If current element is smaller than the pivot 
            if (a[j] < pivot) 
            {
                i++;
                steps-=2;
                // swap arr[i] and arr[j]
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = a[i+1]; 
        a[i+1] = a[last]; 
        a[last] = temp; 

        int pi = i+1; 
        // Recursively sort elements before 
        // partition and after partition 
        quickSort(a, first, pi-1); 
        quickSort(a, pi+1, last); 
    }

    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount()
    {
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(int stepCount)
    {
        steps = stepCount;
    }
}
