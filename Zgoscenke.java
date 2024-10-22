import java.util.Scanner;
// import java.util.Vector;

public class Zgoscenke {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int n = ns.nextInt(); // zgoscenke
        int k = ns.nextInt(); // kol podatkov

       
        int trenutna = 0;
        int ind = 1;

        while (ns.hasNextInt()) {
            int a = ns.nextInt();
            if (trenutna + a > k) {
                ind++;
                trenutna = 0;
                if (ind > n) break;
            }

            trenutna+=a;

            System.out.println(a + " EP -> zgoscenka " + ind + " (" + trenutna + "EP)");
        }

    }
}

