import java.util.Scanner;
// import java.util.Vector;

public class VozniRed {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int h1 = ns.nextInt(), m1 = ns.nextInt(), h2 = ns.nextInt(), m2 = ns.nextInt(), d = ns.nextInt();

        int cas = h1 * 60 + m1;
        int konec = h2 * 60 + m2;


        while (cas <= konec) {
            System.out.print((cas/60) + ":");
            if (cas%60 < 10) System.out.print(0);
            System.out.println(cas%60);
            cas += d;
        }
    }
}

