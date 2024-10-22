import java.util.Scanner;
// import java.util.Vector;

public class PredvolilniGolaz {
    public static int pogostitev(int cena, int st, int vino) {
        cena *= st;
        return cena + vino * (cena%2 + cena/2);
    }
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int denar = ns.nextInt();

        while (ns.hasNextInt()) {
            int cena = ns.nextInt(), st = ns.nextInt(), vino = ns.nextInt();
            cena = pogostitev(cena, st, vino);

            denar -= cena;
            System.out.println(cena + " " + ((denar >= 0) ? denar : "-")) ;



            if (denar <= 0)
                break;
        }
    }
}

