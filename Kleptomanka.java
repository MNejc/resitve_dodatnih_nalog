import java.util.Scanner;
// import java.util.Vector;

public class Kleptomanka {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int m = ns.nextInt();
        int d = ns.nextInt();

        int st = 0;

        for (int i = 1; i < 10; i+=2) {
            for (int j = m+1; j < 10; j++) {
                for (int k = 0; k < 10; k+=d) {
                    System.out.println(i+"-"+j+"-"+k);
                    st++;
                }
            }
        }
        System.out.println(st);
    }
}

