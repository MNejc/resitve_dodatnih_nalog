import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class VsiRazlicniI {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        

        int n = ns.nextInt();
        Set<Integer> mnozica = new HashSet<>();

        int najmanjse = 1000000000;
        boolean soRazlicni = true;

        for (int i = 0; i < n; i++) {
            int a = ns.nextInt();
            if (mnozica.contains(a)) {
                soRazlicni = false;

                najmanjse = Math.min(najmanjse, a);
            }
            mnozica.add(a);
        }

        if (soRazlicni) 
            System.out.println("RAZLICNI");
        else 
            System.out.println(najmanjse);
    }
}

