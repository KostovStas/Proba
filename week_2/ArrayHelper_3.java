package week_2;

//Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй

public class ArrayHelper_3 {
    public static void main(String[] args) {
        int[] mas1;
        int[] mas2;
        mas1 = new int[2];
        mas2 = new int[2];
        mas1[0]=2;
        mas1[1]=3;
        mas2[0]=567;
        mas2[1]=456;

        mas1[0]=mas2[0];
        mas1[1]=mas2[1];
        for(int t: mas2) {
            System.out.println(t);
        }

    }
}