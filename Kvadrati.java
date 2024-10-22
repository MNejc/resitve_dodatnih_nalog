import java.util.Scanner;
// import java.util.Vector;

public class Kvadrati {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt(), b = ns.nextInt();

        for (int i = a; i < b+1; i++) {
            System.out.println(i*i);
        }
    }
}

