package lesson_6;

public class CheckArray {
    private int[] array;
    public boolean checkArray(int[] array) {
        boolean one = false;
        boolean four = false;
        for (int i: array) {
            if(i != 1 && i!=4) return false;
            if(i == 1) one = true;
            if(i == 4) four = true;
        }
        return one && four;
    }
}
