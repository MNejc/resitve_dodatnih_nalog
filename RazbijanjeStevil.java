import java.util.Scanner;
// import java.util.Vector;

public class RazbijanjeStevil {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        long n = ns.nextLong();
        long m = ns.nextLong();

        long mask = 1;
        
        while(mask <= m)
            mask *= 10;


        long mask2 = 1;

        while(mask2 <= n)
            mask2 *= 10;

        while (mask > 0) {
            long k = m / mask;
            m %= mask;
            mask /= 10;
            if (k == 0)
                continue;

            for (int i = 0; i < k; i++) {
                mask2 /= 10;
                System.out.print(n/mask2);
                n %= mask2;
            }
            System.out.println();
        }
    }
}

