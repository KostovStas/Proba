//������������ ������ �������� � ������� (������� ��� �� 0 �� 24)
//���� ����� �� 9 �� 18, �� ������� "� �� ������", � ������ ������ "� �������")
import java.util.Scanner;

public class HomeTask_4_1 {
    public static void main(String[] args) {

        System.out.println("Input time in range 0-24");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        String message = "";
        if (hour <=8 ) {
            message = "Home";
        }
        if (hour>=19) {
            message = "Home";
        }
        if (hour<=24) {
            message = "Home";
        }
        if (hour>= 9 && hour<=18 ) {
            message = "At work";
        }
                System.out.println(message);
            }
        }

