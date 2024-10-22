import java.util.Scanner;
// import java.util.Vector;

public class PotencaPoModulu {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int a = ns.nextInt();
        int b = ns.nextInt();
        int mod = ns.nextInt();

        int tren = a;
        int odg = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                odg *= tren % mod;
                odg %= mod;
            }
            b = b >> 1;
            tren *= tren;
        }
        System.out.println(odg);
    }
}

