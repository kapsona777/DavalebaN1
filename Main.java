package homework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        C C_1=new C();
        Scanner num=new Scanner(System.in);
        C_1.a=num.nextInt();
        C_1.b=num.nextInt();
        C_1.c=num.nextInt();
        C_1.Data();
    }
}