import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class StetjeKlicovII {
    static int a;
    static int b;
    static int st = 0;
    static Set<Integer> mnozica = new HashSet<>();

    public static void f(int n) {
        if (mnozica.contains(n)) return;
        mnozica.add(n);
        st++;
        if (n != 0) {
            f(n/a);
            f(n/b);
        }
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

