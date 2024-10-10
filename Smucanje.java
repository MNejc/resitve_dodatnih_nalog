import java.util.Scanner;
// import java.util.Vector;

public class Smucanje {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int n = ns.nextInt();
        int naj = Integer.MAX_VALUE;
        int najInd = -1;
        
        for (int i = 0; i < n; i++) {
            int a = ns.nextInt();
            if (a==0) continue;
            int b = ns.nextInt();
            if (b==0) continue;
            if (a+b < naj) {
                naj = a+b;
                najInd = i;
            }

        }

        if (najInd == -1)
            System.out.println("NIHCE");
        else
            System.out.println((najInd+1) + "\n" + naj);
    }
}

