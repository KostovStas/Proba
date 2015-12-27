package week_2.Week_2_1;


public class ArrayHelper_4_2_1 {
    public static  int[] arrayGanerate (int size) {
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }

}
