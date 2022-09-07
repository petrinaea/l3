package lesson_6;

public class ReturnNewArray {
    private int [] array;
    private int [] newArray;

    public int[] returnNewArray (int[] array){
        this.array = array;
        isFourExists(array);
        int temp = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4){
                temp = array.length - i - 1;
                break;
            }
        }

        this.newArray = new int[temp];
        int temp1 = 0;
        for (int i = array.length - temp; i < array.length; i++) {
            newArray[temp1] = array[i];
            temp1++;
        }
        return newArray;
    }

    private void isFourExists(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4){
                count++;
            }
        }
        if (count == 0){
            throw new RuntimeException("В массиве нет числа 4");
        }
    }

}
