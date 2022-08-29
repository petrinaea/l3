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

  // task3
  Apple apple1 = new Apple();
  Apple apple2 = new Apple();
  Apple apple3 = new Apple();

  Orange orange1 = new Orange();
  Orange orange2 = new Orange();

  Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
  Box<Orange> box2 = new Box<Orange>(orange1, orange2);

  System.out.println(box1.compare(box2));

  Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
}
