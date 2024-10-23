import java.util.Scanner;
import java.util.Arrays;
// import java.util.Vector;

public class MaksimumPoStolpcihI {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int v = ns.nextInt();
        int s = ns.nextInt();

        int[] m = new int[s];
        for (int i = 0; i < s; i++) {
            m[i] = -1000000000;
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < s; j++) {
                m[j] = Math.max(m[j], ns.nextInt());
            }
        }
        System.out.println(Arrays.toString(m));
    }
}

