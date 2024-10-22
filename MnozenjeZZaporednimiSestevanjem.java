import java.util.Scanner;
// import java.util.Vector;

public class MnozenjeZZaporednimSestevanjem {
    public static int vsota(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int a = ns.nextInt();
        int b = ns.nextInt();

        int tren = a;
        int odg = 0;
        while (b > 0) {
            if ((b & 1) == 1) {
                odg = vsota(odg, tren);
            }
            b = b >> 1;
            tren = tren << 1;
        }
        System.out.println(odg);
    }
}

