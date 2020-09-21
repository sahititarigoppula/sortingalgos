// Java Program for different Sorting Algorithms


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{

public static void main(String[] args) {
   for(int i=0;i<3;i++){   
         Scanner scanner = new Scanner(System.in);
         int input;
         System.out.println("\n" + "Enter numbers, with any character at the end");
        List<Integer> list = new ArrayList<>();
         while (true) {
            if(scanner.hasNextInt())
                 input = scanner.nextInt();
            else break;    
            list.add(input);
         }
       System.out.println("Enter Sorting Algorithms ( Bubblesort / Insertionsort / Mergesort )");
       scanner.nextLine();
       String Algo = scanner.nextLine();
//list to array

        Integer[] intArray = new Integer[list.size()];
        intArray = list.toArray(intArray);
// print list and array
       Algo = Algo.replaceAll("\\s", "").toLowerCase();
      System.out.println("\n" +"Array entered: " + list + "\n" + "Algorithm: " + Algo.toUpperCase()); 

//Checking the Algorithm

    if(Algo.equals("bubblesort")){
    Bubblesort bs = new Bubblesort();
    bs.bubbleSort(intArray);

    }
    else if(Algo.equals("mergesort")){
      Mergesort ms = new Mergesort();
      ms.Msort(intArray);
    }
    else if(Algo.equals("insertionsort")){
      Insertionsort si = new Insertionsort();
      si.insertionSort(intArray);
    }
    else{
      System.out.println("Enter a valid sorting algorithm\n");
    }
    list.clear();
    }
}
}