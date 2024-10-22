import java.util.Scanner;
import java.util.Random;
// import java.util.Vector;

public class VrazeverniBoris {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int s = ns.nextInt(), n = ns.nextInt();
        Random rand = new Random(s);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " (" + ((i%7 == 0) ? "N" : "D") + "): ");

            int sodo = 0;
            int meti = 0;
            while ((sodo < 3 && i%7 != 0) || (sodo < 5 && i%7 == 0)) {
                int pike = rand.nextInt(6) + 1;

                meti++;
                sodo += pike%2;

                System.out.print(pike + " ");
            }
            System.out.println("[" + meti + "]");
        }
    }
}

