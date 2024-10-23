import java.util.Scanner;
import java.util.Arrays;
// import java.util.Vector;

public class PoliticnaNasprotjaI {
    static int l;
    static int d;
    static int c;
    static int st = 0;

    public static void kombinacija(int v[], int nivo) {
        if (nivo == l+c+d) {
            st++;
            return;
        }
        int ll = 0;
        int ld = 0;
        int lc = 0;
        for (int i = 0; i < nivo; i++) {
            if (v[i] == -1) ll++;
            if (v[i] ==  1) ld++;
            if (v[i] ==  0) lc++;
        }

        if (ll != l && (nivo == 0 || v[nivo-1] !=  1)) {
            v[nivo] = -1;
            kombinacija(v, nivo+1);
        }
 
        if (ld != d && (nivo == 0 || v[nivo-1] != -1)) {
            v[nivo] = 1;
            kombinacija(v, nivo+1);
        }           

        if (lc != c) {
            v[nivo] = 0;
            kombinacija(v, nivo+1);
        }
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        l = ns.nextInt();
        d = ns.nextInt();
        c = ns.nextInt();

        int[] v = new int[l+d+c];

        kombinacija(v, 0);

        System.out.println(st);

    }
}

