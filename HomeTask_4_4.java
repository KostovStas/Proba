import java.util.Scanner;

// ������ ����� � ��������� ������ � �������, � ��������� ����� �� ��� � ��������� �� 0 �� 1
public class HomeTask_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  i = sc.nextDouble();
        if (i>=0 && i<=1){
            System.out.println("Tru");
        }
        if (i<0 || i>1){
            System.out.println("False");
        }

    }
}