import java.util.Scanner;
import java.util.Random;

public class VsiRazlicniII {
    private static final int MAKS_STEVILO = 10000;
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int s = ns.nextInt();
        Random random = new Random(s);

        int n = ns.nextInt();
        int[] frekvenca = new int[MAKS_STEVILO * 2 + 10];
        
        for (int i = 0; i < n; i++) {
            int clen = random.nextInt(2 * MAKS_STEVILO + 1);
            frekvenca[clen] ++;
        }

        int naj = 0;
        int najInd = 0;
        for (int i = 0; i < MAKS_STEVILO * 2 + 1; i++) {
            if (frekvenca[i] > naj) {
                naj = frekvenca[i];
                najInd = i;
            }
        }

        if (naj == 1) {
            System.out.println("RAZLICNI");
        } else {
            System.out.println(najInd-MAKS_STEVILO);
        }
    }
}

