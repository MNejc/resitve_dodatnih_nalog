import java.util.Scanner;
// import java.util.Vector;

public class Romanje {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int d = ns.nextInt(), p = ns.nextInt(), z = ns.nextInt();

        int i = 1;
        while (p > 0 && d > 0) {
            System.out.println(String.format("%d: %d -> %d", i, d, Math.max(d-p, 0)));
            i++;
            d -= p;
            p-=z;
        }
    }
}

