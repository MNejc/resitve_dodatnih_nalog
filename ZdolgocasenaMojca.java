import java.util.Scanner;
import java.util.Random;
// import java.util.Vector;

public class ZdolgocasenaMojca {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int s = ns.nextInt(), k = ns.nextInt(), d = ns.nextInt();
        Random rand = new Random(s);

        int N = 1000;

        boolean[] prastevila = new boolean[N]; // 0 -> praštevilo

        prastevila[0] = true;
        prastevila[1] = true;

        for (int i = 2; i < N; i++) {
            if (prastevila[i]) continue;

            int j = i*2;

            while (j < N) {
                prastevila[j] = true;
                j += i;
            }
        }

        for (int i = 1; i <= d; i++) {
            System.out.println(i + ". dan:");

            int vsota = 0;
            int met = 1;
            while (prastevila[vsota]) {
                System.out.print("    " + met + ". met: ");
                vsota = 0;
                for (int j = 0; j < k; j++) {
                    int pike = rand.nextInt(6) + 1;
                    vsota += pike;
                    System.out.print(pike + " ");
                }
                System.out.println("| vsota = " + vsota);
                met++;
            }
        }
    }
}

