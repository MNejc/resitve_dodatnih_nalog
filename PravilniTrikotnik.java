import java.util.Scanner;
import java.util.Arrays;
// import java.util.Vector;

public class PravilniTrikotnik {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int d = ns.nextInt();
        int n = ns.nextInt();

        int[] y = new int[n];
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            y[i] = ns.nextInt();
            x[i] = ns.nextInt();
        }


        boolean obstaja = false;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    double st1 = Math.sqrt((x[i]-x[j]) * (x[i]-x[j]) + (y[i]-y[j]) * (y[i]-y[j]));
                    double st2 = Math.sqrt((x[j]-x[k]) * (x[j]-x[k]) + (y[j]-y[k]) * (y[j]-y[k]));
                    double st3 = Math.sqrt((x[i]-x[k]) * (x[i]-x[k]) + (y[i]-y[k]) * (y[i]-y[k]));

                    if (Math.max(st1, Math.max(st2, st3)) - Math.min(st1, Math.min(st2, st3)) < Math.pow(10, -d) * Math.min(st1, Math.min(st2, st3))) {
                        obstaja = true,
                        System.out.println(i + " " + j +" " + k);
                    }

                }
            }
        }

        if (!obstaja) 
        System.out.println("BREZ");
    }
}

