import java.util.Scanner;
import java.util.Random;
// import java.util.Vector;

public class NajboljseSeme {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt(), b = ns.nextInt(), n = ns.nextInt();

        long naj = 0;
        int najInd = -1;
        for (int i = a; i < b+1; i++) {
            Random rand = new Random(i);
            long st = 0;
            for (int j = 0; j < n; j++) {
                st *= 10;
                st += rand.nextInt(10);
            }
            if (st > naj) {
                naj = st;
                najInd = i;
            }
        }
        System.out.println(najInd);
    }
}

