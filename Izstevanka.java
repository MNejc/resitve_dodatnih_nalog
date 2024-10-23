import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Izstevanka {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int n = ns.nextInt();
        int b = ns.nextInt();

        List<String> seznam = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ime = ns.next();
            seznam.add(ime);
        }

        int m = n;

        for (int i = 0; i < n-1; i++) {
            System.out.println(seznam.get(((b-1)%m)));
            seznam.remove((b-1)%m);
            m--;
        }
    }
}

