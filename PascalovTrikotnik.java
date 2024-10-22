import java.util.Scanner;
// import java.util.Vector;

public class PascalovTrikotnik {
    public static int C(int n, int k) {
        int c = 1;

        for (int i = k+1; i <= n; i++) {
            c *= i;
        }

        for (int i = 1; i <= n-k; i++) {
            c /= i;
        }
        
        return c;
    }
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(C(i,j) + ((j!=i-1)?" ":""));   
            }
            System.out.println();
        }
    }
}

