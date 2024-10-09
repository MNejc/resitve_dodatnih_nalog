import java.util.Scanner;
// import java.util.Vector;

public class StevilskaZaporedja {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt(), b = ns.nextInt();
        int k = ns.nextInt();

        if (k == 0 || (k > 0 && a > b) || (k < 0 && a < b)) {
            System.out.println("NAPAKA");
            return;
        }


        while ((a >= b && k < 0) || (a <= b && k > 0)) {
            System.out.println(a);
            a += k;
        }


    }
}

