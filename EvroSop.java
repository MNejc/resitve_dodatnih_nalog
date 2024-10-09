import java.util.Scanner;
// import java.util.Vector;

public class EvroSop {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int ena = 0;
        int dva = 0;

        while (ns.hasNextInt()) {
            int a = ns.nextInt();
            if (a == 1) ena++;
            else {
                if (ena == 0) {
                    System.out.println("BANKROT");
                    return;
                }
                ena--;
                dva++;
            }
        }
        System.out.println(ena);
        System.out.println(dva);
    }
}

