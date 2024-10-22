import java.util.Scanner;
import java.util.Random;
// import java.util.Vector;

public class SahovskiPopoldnevi {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int s = ns.nextInt(), a = ns.nextInt(), b = ns.nextInt();
        int p = ns.nextInt(), z = ns.nextInt(), d = ns.nextInt();

        Random rand = new Random(s);

        for (int i = 1; i <= d; i++) {
            System.out.print(i + ". dan: ");

            int A = 0;
            int B = 0;
            int st = 0;

            while (A < z && B < z && st < p) {
                int rezultat = rand.nextInt(100);

                if (rezultat < a) {
                    A++;
                    System.out.print("A");
                }
                else if (rezultat < a+b) {
                    B++;
                    System.out.print("B");
                } else 
                    System.out.print("r");
                
                st++;
            }

            System.out.println(" (" + st + ")");
        }
    }
}

