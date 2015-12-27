import java.util.Scanner;

public class Reader {
    int i;
    int k;
    public void Scan(){
        System.out.println("Vvedite pervoe chislo");
        Scanner scn=new Scanner(System.in);
        i= scn.nextInt();
        System.out.println("Vvedite vtoroe chislo");
        k = scn.nextInt();
    }
}
