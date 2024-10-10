import java.util.Scanner;
// import java.util.Vector;

public class AnzetoveLedeneSvece {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int n = ns.nextInt();

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < (1 << (n-1)) + 1; x++) {
                if (x % (1 << y) == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}

