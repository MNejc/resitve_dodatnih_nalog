import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
// import java.util.Vector;

public class TelefonskiImenik {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        Map<String, String> imenik = new HashMap<>();
        int n = ns.nextInt();
        ns.nextLine();

        for (int i = 0; i < n; i++) {
            String podatek = ns.nextLine();
            String[] podatka = podatek.split(" ");

            imenik.put(podatka[0], podatka[1]);
        }

        int k = ns.nextInt();
        ns.nextLine();
        for (int i = 0; i < k; i++) {
            String ime = ns.nextLine();

            System.out.println(((imenik.get(ime) == null) ? "NEZNANA" : imenik.get(ime)));
        }
    }
}

