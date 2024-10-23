import java.util.Scanner;
import java.util.Arrays;

public class IzstopajočiElement {
    public static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int n = ns.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = ns.nextInt();
        }

        boolean obstaja = false;

        for (int i = 0; i < n; i++) {
            int nsdSeznama = v[0] * v[1];
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                nsdSeznama = gcd(nsdSeznama, v[j]);
            }

            if (nsdSeznama != gcd(nsdSeznama, v[i])) {
                System.out.println(v[i]);
                obstaja = true;
            }
        }

        if (!obstaja)
            System.out.println("NIC");

    }
}

