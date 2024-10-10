import java.util.Scanner;
// import java.util.Vector;

public class Sahovnica {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int v = ns.nextInt();
        int s = ns.nextInt();
        int d = ns.nextInt();

        System.out.print("+");
        for (int x = 0; x < s*d; x++)
            System.out.print(" -");
        System.out.println(" +");


        for (int y = 0; y < v; y++) {
            for (int py = 0; py < d; py++) {
                System.out.print("|");
                for (int x = 0; x < s; x++) {
                    for (int px = 0; px < d; px++) {
                        if ((x+y) % 2 == 0)
                            System.out.print("  ");
                        else 
                            System.out.print(" *");
                    }
                }
                System.out.println(" |");
            }
        }

 
        System.out.print("+");
        for (int x = 0; x < s*d; x++)
            System.out.print(" -");
        System.out.println(" +");
    }
}

