import java.util.Scanner;
// import java.util.Vector;

public class Potenca {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt(), b = ns.nextInt();

        System.out.println((long)Math.pow(a, b));
    }
}

