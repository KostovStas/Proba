package week_2.Week_2_1;


public class MinMax {
    public static void main(String[] args) {

        int[] mass = CreateArrayMetod.arrayGanerate(5);


        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i != mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
