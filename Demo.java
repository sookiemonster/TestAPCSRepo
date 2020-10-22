import java.util.*;

public class Demo {
  public static void main(String[] args) {
    //PRINT LOOPS -----------------------------------------------
      if (args.length == 0) {
        printLoop(5);
      } else {
        printLoop( Integer.parseInt(args[0]) );
      }

    //ARRAY TESTING -----------------------------------------------

    // int[]arr1 = {1, 2, 3};
    // int[]arr2 = {4, 5, 6, 7};
    // int[]arr3 = {8, 9};
    // int[]arr4 = {10};
    // int[]arr5 = {11, 12, 13, 14, 15};
    //
    //
    // int[][]bigArray = new int[5][];
    // bigArray[0] = arr1;
    // bigArray[1] = arr2;
    // bigArray[2] = arr3;
    // bigArray[3] = arr4;
    // bigArray[4] = arr5;

    // System.out.println(arrToString(arr1));
    // int[][] bigArray = create2DArray(4, 3, 3);
    // int[][] bigArr2 = create2DArrayRandomized(4,10,100);
    // System.out.println(arrayDeepToString(bigArray).replace("},", "},\n"));
    // System.out.println(arrayDeepToString(bigArr2).replace("},", "},\n"));
  }

  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(i);
      }
      System.out.println("");
    }
  }

  public static String arrToString(int[] arr) {
    String result = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i != 0) {
        result += ", ";
      }
      result += arr[i];
    }
    return result + "}";
  }

  public static String arrayDeepToString(int[][] arr) {
    String result = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i != 0) {
        result += ", ";
      }
      result += arrToString(arr[i]);
    }
    return result + "}";
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][]arr = new int[rows][cols];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        Random r = new Random();
        arr[i][j] = r.nextInt(maxValue + 1);
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][]arr = new int[rows][];
    for (int i = 0; i < arr.length; i++) {
      Random elements = new Random();
      arr[i] = new int[elements.nextInt(cols+1)];
      for (int j = 0; j < arr[i].length; j++) {
        Random r = new Random();
        arr[i][j] = r.nextInt(maxValue + 1);
      }
    }
    return arr;
  }
}
