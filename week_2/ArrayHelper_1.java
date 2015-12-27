package week_2;

//Найти минимальное и максимальное значения в массиве и вывести их на консоль

public class ArrayHelper_1 {
    public static  void main (String[] args) {
        int[] mas= CreateArrayMetod.arrayGanerate(10);

        int min = mas[0];
        int max = mas[0];
        for (int i = 0; i != mas.length-1; i++) {
            if (mas[i]>max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println(max +" " +min);


    }

}
