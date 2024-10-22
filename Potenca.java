import java.util.Scanner;
// import java.util.Vector;

public class Potenca {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int a = ns.nextInt();
        int b = ns.nextInt();

        long tren = a;
        long odg = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                odg *= tren;
            }
            b = b >> 1;
            tren *= tren;
        }
        System.out.println(odg);
    }
}

