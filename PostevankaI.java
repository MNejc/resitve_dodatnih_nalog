import java.util.Scanner;
// import java.util.Vector;

public class PostevankaI {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt(), b = ns.nextInt();

        for (int i = 1; i <= b; i++) {
            System.out.println(a*i);
        }
    }
}

