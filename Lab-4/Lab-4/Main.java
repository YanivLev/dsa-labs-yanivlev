import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      long bubbleStartTime = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      long bubbleEndTime = System.nanoTime();
      long bubbleElapsedTime = bubbleEndTime - bubbleStartTime;
      Lab4.outputList(bubbleSortedList);
      System.out.println("\nElapsed time: " + bubbleElapsedTime + " ns");

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      long insertionStartTime = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      long insertionEndTime = System.nanoTime();
      long insertionElapsedTime = insertionEndTime - insertionStartTime;
      Lab4.outputList(insertionSortedList);
      System.out.println("\nElapsed time: " + insertionElapsedTime + " ns");
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here

    for (int i = 1; i < integerList.size(); i++) {
      int currentElement = integerList.get(i);
      int j;
      for (j = i - 1; j >= 0 && integerList.get(j) > currentElement; j--) {
        integerList.set(j + 1, integerList.get(j));
      }
      integerList.set( j + 1, currentElement);
    }
    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    boolean needNextPass = true;
    for(int i = 1; i < integerList.size() && needNextPass; i++) {
      needNextPass = false;
      for(int j = 0; j < integerList.size() - i; j++) {      
        if (integerList.get(j) > integerList.get(j + 1)) {
          int temp = integerList.get(j);
          integerList.set(j, integerList.get(j + 1));
          integerList.set(j + 1, temp);
          needNextPass = true;
        }
      }
    }
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("Lab-4/integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}