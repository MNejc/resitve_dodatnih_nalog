import java.util.Scanner;
import java.util.Arrays;
// import java.util.Vector;

public class Kombinacije {
    static int n;
    static int k;

    public static void kombinacija(int v[], int nivo) {
        if (nivo == k) {
            System.out.println(Arrays.toString(v));
            return;
        }
        int prej = (nivo == 0) ? 0 : v[nivo-1];
        for (int i = prej+1; i <= n; i++) {
            v[nivo] = i;
            kombinacija(v, nivo+1);
        }
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        n = ns.nextInt();
        k = ns.nextInt();

        int[] v = new int[k];

        kombinacija(v, 0);


    }
}

