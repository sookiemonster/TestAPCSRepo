public class Demo {
  public static void main(String[] args) {
    int[]arr1 = {1, 2, 3};
    int[]arr2 = {4, 5, 6, 7};
    int[]arr3 = {8, 9};
    int[]arr4 = {10};
    int[]arr5 = {11, 12, 13, 14, 15};


    int[][]bigArray = new int[5][];
    bigArray[0] = arr1;
    bigArray[1] = arr2;
    bigArray[2] = arr3;
    bigArray[3] = arr4;
    bigArray[4] = arr5;

    System.out.println(arrToString(arr1));
    System.out.println(arrayDeepToString(bigArray).replace("},", "},\n"));
  //  if (args.length == 0) {
    //  printLoop(5);
//    } else {
    //  printLoop( Integer.parseInt(args[0]) );
//    }
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
}
