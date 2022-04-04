package lesson_1;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // task1
    String[] arr1 = {"hello", "world", "abcd", "678"};
//    Integer[] arr2 = {3, 4, 6, 234, -1324, 111};

    System.out.println(Arrays.toString(arr1));
    changeElements(arr1, 2, 3);
    System.out.println(Arrays.toString(arr1));


    //task2
    List<String> list = convertToList(arr1);
    System.out.println(list.getClass() + " : " + list);
  }

  private static <T> void changeElements(T[] array, int id1, int id2) {
    T temp = array[id1];
    array[id1] = array[id2];
    array[id2] = temp;
  }

  private static <E> List<E> convertToList(E[] array) {
    return Arrays.asList(array);
  }
}
