package com.edityj.v1ch03;

import java.util.Arrays;

public class TestArray {
  public static void main(String[] args) {
    int[] a = new int[]{
        10, 4, 1, 2, 2, 4, 5,
    };
    int[] b = a.clone();
    System.out.println(Arrays.equals(a, b));

    b[3] = 10;

    System.out.println(Arrays.binarySearch(a, 3));

//    Arrays.fill(a,2);
    Arrays.sort(a);
    for (int item : a) {
      System.out.println(item);
    }

    int[][] c = {
        {1, 2, 3, 4},
        {2, 3, 4, 5},
        {12, 3, 4, 2}
    };

    System.out.println(Arrays.deepToString(c));
  }
}
