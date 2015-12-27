package week_2;

//Поменять местами наибольший и наименьший элементы в массиве

public class ArrayHelper_2 {
    public static void main(String[] args) {
        int[] mass;
        mass = new int[3];
        mass[0] = 0;
        mass[1] = 1;
        mass[2] = 567;
        int max = mass[0];
        int min = mass[0];
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] > max) {
                max = mass[i];
                imax = i;
            }
             if(mass[i]< min){
                 min = mass[i];
                 imin=i;
             }

         }

        mass[imin]=max;
        mass[imax]=min;
        for (int i = 0; i<mass.length;i++){
            System.out.println("i" + i +" mass[" + i + "]=" + mass[i]);
        }
    }
}
