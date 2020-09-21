import java.util.Arrays;

// Merge sort

public class Mergesort {

  // Merge two sub arrays L and M into array
  void merge(Integer intArray[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    // fill the left and right array
    for (int i = 0; i < n1; i++)
      L[i] = intArray[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = intArray[q + 1 + j];

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        intArray[k] = L[i];
        i++;
      } else {
        intArray[k] = M[j];
        j++;
      }
      k++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
      intArray[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      intArray[k] = M[j];
      j++;
      k++;
    }
  }

  // Divide the array into two sub arrays, sort them and merge them
  void mergeSort(Integer intArray[], int left, int right) {
    if (left < right) {

      // m is the point where the array is divided into two sub arrays
      int mid = (left + right) / 2;

      // recursive call to each sub arrays
      mergeSort(intArray, left, mid);
      mergeSort(intArray, mid + 1, right);

      // Merge the sorted sub arrays
      merge(intArray, left, mid, right);
    }
  }

  public void Msort(Integer intArray[]) {

    // call the method mergeSort()
    // pass argument: array, first index and last index
    mergeSort(intArray, 0, intArray.length - 1);

    System.out.println("Sorted Array:");
    System.out.println(Arrays.toString(intArray));
  }
}