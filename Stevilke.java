import java.util.Scanner;
// import java.util.Vector;

public class Stevilke {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        long a = ns.nextLong();

        while (a > 0) {
            System.out.println(a%10);
            a /= 10;
        }
    }
}

