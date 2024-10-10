import java.util.Scanner;
// import java.util.Vector;

public class IgorjeviBloki {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt();
        int b = ns.nextInt();
        int c = ns.nextInt();

        for (int y = 0; y < Math.max(a,Math.max(b,c)); y++) {
            for (int x = 0; x < (a+b+c+2); x++) {
                if (x < a && y < a)
                    System.out.print(a);
                else if (a < x && x < a+b+1 && y < b)
                    System.out.print(b);
                else if (a+b+1 < x && x < a+b+c+2 && y < c)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

