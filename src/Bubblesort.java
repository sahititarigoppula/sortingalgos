import java.util.Arrays;

// Bubble sort

public class Bubblesort {

void bubbleSort(Integer intArray[]) {
    int size = intArray.length;

    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)
          if (intArray[j] > intArray[j + 1]) {

            // swap if left element is greater than right
            int temp = intArray[j];
            intArray[j] = intArray[j + 1];
            intArray[j + 1] = temp;
        }

            
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(intArray));
  }
}