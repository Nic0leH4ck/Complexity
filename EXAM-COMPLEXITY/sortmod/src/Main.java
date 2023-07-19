public class Main {
    public static void sortMod(int[] a, int k) {
        int temp;
        int currentIndex = 0; // Index variable for iteration
        int switchIndex = 0; // Index of the next position to switch
        int targetModValue = 0; // Target modulo value for sorting

        for (int modSum = 0; modSum < k; modSum++) {
            while (currentIndex < a.length) {
                if (a[currentIndex] % k == targetModValue) {
                    temp = a[switchIndex];
                    a[switchIndex] = a[currentIndex];
                    a[currentIndex] = temp;
                    switchIndex++;
                }
                currentIndex++;
            }
            currentIndex = switchIndex;
            targetModValue++;
        }
        return;
    }

    //OPT2:
    public static void sortMod(int[] a, int k) {

        int i, j, temp, count = 0;
        for (i = 0; i < k; i++) {
            for (j = count; j < a.length; j++) {
                if (a[j] % k == i) {
                    temp = a[j];
                    a[j] = a[count];
                    a[count] = temp;
                    count++;
                }
            }
        }
    }
}

//The sortMod method takes an integer array a and an integer k as input. It sorts the elements of the array based on their modulo value with respect to k.
//
//Here's an explanation of the code:
//
//The method initializes variables i, j, temp, and count.
// The variable count keeps track of the number of elements that have been sorted.
//
//The outer loop iterates from i = 0 to k - 1.
// This loop determines the modulo value for which the elements are being sorted.
//
//Inside the outer loop, the inner loop iterates from j = count to the end of the array.
// This loop searches for elements in the array that have a modulo value equal to i.
//
//If an element a[j] has a modulo value equal to i, the code enters the if condition.
//
//The code swaps the element a[j] with the element at the count index.
// This ensures that all elements with a modulo value equal to i are moved to the beginning of the array in the sorted order.
//
//After swapping, the count variable is incremented to reflect that one more element has been sorted.
//
//The inner loop continues until it reaches the end of the array,
// checking all elements for a modulo value equal to i.
//
//Once the inner loop finishes for a particular value of i,
// the outer loop proceeds to the next value of i and repeats the process.
//
//After both loops complete execution,
// the array a will be sorted based on the modulo values with respect to k.
//
//The code uses a variation of the selection sort algorithm to sort the array elements
// based on their modulo values.
// The time complexity of this code is O(k * n), where k is the given value and n is the length of the array a.

