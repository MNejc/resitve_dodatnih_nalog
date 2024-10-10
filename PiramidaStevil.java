import java.util.Scanner;
// import java.util.Vector;

public class PiramidaStevil {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int n = ns.nextInt();

        int st = 1;
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print((j + st/2)%10);
            }
            System.out.println();
            st+=2;
        }
    }
}

