package week_1;

//������ ��� �����, �������� ��������� ����� ���� ����� (������������ ���������� %)
import java.util.Scanner;

public class HomeTask_4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int y = sc.nextInt();
        int x=(i % 10);
        int z= (y % 10);
        if (x==z)
        {
            System.out.println("true" + x);
        }
        else
        {
            System.out.println("false");
        }
    }
}