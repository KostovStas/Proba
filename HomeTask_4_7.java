
// ������ ��� �����, ���� ���� �� ��� �������� �� ������ ��� �������,
// �� ������� ��� � ���������� ��������� ������� (����� ����� �� �������  � ������)
// � ������ ������ ������� false � ���������� ��������� ������� (����� ����� �� �������  � ������)


import java.util.Scanner;

public class HomeTask_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double i = x / y;
        double q = y / x;
        if (x % y == 0)
        {
            System.out.println("Tru"  + i);
                   }
            else {
            System.out.println("False"  +i);
        }

        }
    }



