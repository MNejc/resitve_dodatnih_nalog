import java.util.Scanner;
// import java.util.Vector;

public class StetjeKlicovI {
    static int a;
    static int b;
    static int st = 0;

    public static int f(int n) {
        st++;
        return (n == 0) ? 1 : f(n/a) + f(n/b);
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        a = ns.nextInt();
        b = ns.nextInt();
        int n = ns.nextInt();
        
        f(n);

        System.out.println(st);

    }
}

