import java.util.*;
import java.io.*;
public class Merge{
  public static void main(String[] args){
    int[] a = {2, 3, 1, 6, 9, 3, 5};
    mergesort(a);
    System.out.println(Arrays.toString(a));
  }
  public static void mergesort(int[]data){
    mergesort(data, 0, data.length);
  }
  private static void mergesort(int[]data, int lo, int hi){
    if (lo < hi - 1){
      int a = (lo + hi) / 2;
      int[] x = Arrays.copyOfRange(data, lo, a);
      int[] y = Arrays.copyOfRange(data, a, hi);

      mergesort(x, 0, x.length - 1);
      mergesort(y, 0, y.length - 1);
      int d = 0;
      int e = 0;
      int f = 0;
      int g = data.length;
      while (f < g){
        if (d == x.length - 1){
          for (f; f < g; f++){
            data[f] = y[e];
          }
        }
        if (x[d] >= y[e]){
          data[f] = x[d];
          d++;
          f++;
        }
        if (x[d] < y[e]){
          data[f] = y[e];
          f++;
          e++;
        }
      }
    }
  }
}
