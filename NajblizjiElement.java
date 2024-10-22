import java.util.Scanner;
// import java.util.Vector;

public class NajblizjiElement {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int k = ns.nextInt(), n = ns.nextInt();

        int naj = 100000;
        int najInd = 0;

        for (int i = 0; i < n; i++) {
            int a = ns.nextInt();

            if (naj > Math.abs(k-a)) {
                naj = Math.abs(k-a);
                najInd = i;
            }
        }

        System.out.println(najInd);
    }
}

