import java.util.Scanner;
// import java.util.Vector;

public class Piramida {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1+2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

