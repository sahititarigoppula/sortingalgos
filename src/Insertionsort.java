import java.util.Arrays;

// Insertion sort

public class Insertionsort {

  void insertionSort(Integer intArray[]) {
    int size = intArray.length;

    for (int step = 1; step < size; step++) {
      int key = intArray[step];
      int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.

      while (j >= 0 && key < intArray[j]) {
        intArray[j + 1] = intArray[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      intArray[j + 1] = key;
    }
  
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(intArray));
}
}