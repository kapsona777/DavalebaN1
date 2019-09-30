package homework;
import java.util.Scanner;

public class C {
    public int a;
    public int b;
    public int c;
    public void Data(){
        while (a>=10) {
            a/=10;
        }
        int aFirst=a;
        int bLast=b%10;
        int cSum=0;
        while (c>0) {
            cSum = cSum + c % 10;
            c = c/10;
        }

        System.out.println(aFirst*bLast);
        System.out.println(aFirst*bLast + bLast);

    }
}
