package week_1;


// Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

import java.util.Scanner;

public class HomeTask_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int y = sc.nextInt();
        int x = i + y;
        int z = 11;
        if (x >= z && x <= 19) {
            System.out.println(x);
        } else {
            System.out.println("Summa chisel ne v diapazone 11-19");
        }
    }
}