import java.util.Scanner;
// import java.util.Vector;

public class DigitalneCrtice {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int[] crtice = new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        
        int n = ns.nextInt();

        int naj = 0;
        int najInd = 0;

        for (int i = 0; i < n; i++) {
            int a = ns.nextInt();
            int b = a;
            int st = 0;

            while (a > 0) {
                st += crtice[a%10];
                a /= 10;
            }

            if (st > naj) {
                naj = st;
                najInd = b;
            }
        }

        System.out.println(najInd);
    }
}

