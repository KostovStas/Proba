package week_2.Week_2_1;


 public class ArrayHelper_4_2_2 {
     public static void main(String[] args) {
         int [] mass =ArrayHelper_4_2_1.arrayGanerate(2);
         int max = mass[0];
         int min = mass[0];
         int imax = 0;
         int imin = 0;
         for (int i = 0; i < mass.length-1; i++){
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


