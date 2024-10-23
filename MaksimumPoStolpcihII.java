import java.util.Scanner;
import java.util.Arrays;
// import java.util.Vector;

public class MaksimumPoStolpcihII {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int n = ns.nextInt();

        int[] m = new int[100];
        for (int i = 0; i < 100; i++) {
            m[i] = -1000000000;
        }

        int najD = 0;
        for (int i = 0; i < n; i++) {
            int d = ns.nextInt();
            najD = Math.max(d, najD);
            for (int j = 0; j < d; j++) {
                m[j] = Math.max(m[j], ns.nextInt());
            }
        }

        int[] m2 = new int[najD];
        for (int i = 0; i < najD; i++) {
            m2[i] = m[i];
        }
        System.out.println(Arrays.toString(m2));
    }
}

